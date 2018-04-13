package com.github.oscerd.JavaCassandraExample.Test;

import org.junit.Test;

import com.github.oscerd.JavaCassandraExample.CassandraClientExample;

public class CassandraClientTestExample {

	@Test
	public void testClient() {
		CassandraClientExample client = new CassandraClientExample();
		client.connect("127.0.0.1");
		client.getSession();
		client.createSchema();
		client.loadData();
		client.querySchema();
		client.closeSession();
		client.close();
	}
}