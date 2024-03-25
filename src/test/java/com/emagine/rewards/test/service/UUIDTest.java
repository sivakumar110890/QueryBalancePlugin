package com.emagine.rewards.test.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

import com.emagine.querybal.utils.UUID;

public class UUIDTest {

	@Test
	public void testUuidIntBruteForceSingleThreaded() {
		Set<String> uuids = new HashSet<String>();
		// generate 10 million uuids and check if a collision occurs.
		for (int i = 0; i < 10000000; i++) {
			boolean success = uuids.add(UUID.uuid(11));
			assertTrue(success);
		}
	}

	@Test
	public void testUuidInt01() throws InterruptedException, ExecutionException {
		testUuidIntMultiThreaded(1);
	}

	@Test
	public void testUuidInt02() throws InterruptedException, ExecutionException {
		testUuidIntMultiThreaded(2);
	}

	@Test
	public void testUuidInt04() throws InterruptedException, ExecutionException {
		testUuidIntMultiThreaded(4);
	}

	@Test
	public void testUuidInt08() throws InterruptedException, ExecutionException {
		testUuidIntMultiThreaded(8);
	}

	/**
	 * Multi-threaded uuid generation and collision test. Each thread will
	 * generate 1 million uuids.
	 * 
	 * @param threadCount
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	private void testUuidIntMultiThreaded(final int threadCount) throws InterruptedException, ExecutionException {
		Callable<List<String>> task = new Callable<List<String>>() {
			@Override
			public List<String> call() {
				List<String> result = new ArrayList<String>(1000000);
				for (int i = 0; i < 1000000; i++) {
					result.add(UUID.uuid(11));
				}
				return result;
			}
		};
		List<Callable<List<String>>> tasks = Collections.nCopies(threadCount, task);
		ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
		List<Future<List<String>>> futures = executorService.invokeAll(tasks);
		Set<String> resultList = new HashSet<String>(futures.size());
		for (Future<List<String>> future : futures) {
			List<String> list = future.get();
			for (String val : list) {
				assertTrue(resultList.add(val));
			}
		}
		assertEquals(threadCount, futures.size());
	}
}
