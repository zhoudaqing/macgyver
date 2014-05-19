package io.macgyver.core.web.rythm;

import io.macgyver.test.MacGyverIntegrationTest;

import org.junit.Assert;
import org.junit.Test;
import org.rythmengine.RythmEngine;
import org.rythmengine.template.ITemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class RythmEngineTest extends MacGyverIntegrationTest {

	@Autowired
	RythmEngine engine;

	@Test
	public void testRythmEngine() {
		Assert.assertNotNull(engine);

		ITemplate t = engine.getTemplate("templateFromFile.rythm");
		Assert.assertNotNull(t);
		Assert.assertFalse(t.render().contains("templateFromFile.rythm"));
		Assert.assertTrue(t.render().contains("template from file"));
	}

	@Test
	public void testNotFound() {
		Assert.assertNotNull(engine);

		ITemplate t = engine.getTemplate("notfound.rythm");
		Assert.assertNotNull(t);
		Assert.assertEquals("notfound.rythm", t.render());
	}

	@Test
	public void testExtend() {
		Assert.assertNotNull(engine);

		ITemplate t = engine.getTemplate("extendTest.rythm");
		Assert.assertNotNull(t);
		Assert.assertTrue(t.render().contains("myTemplate"));
	}
}
