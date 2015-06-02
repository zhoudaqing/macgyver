package io.macgyver.plugin.artifactory;

import io.macgyver.core.rest.OkRest;
import io.macgyver.core.rest.OkRest.InvocationBuilder;
import io.macgyver.okrest.OkRestTarget;

import java.io.IOException;
import java.util.List;

import org.assertj.core.util.Lists;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

public class GavcSearchBuilder extends AbstractSearchBuilder<GavcSearchBuilder>  {



	public GavcSearchBuilder(OkRestTarget r) {
		super(r,"/api/search/gavc");
	}

	public GavcSearchBuilder group(String group) {
		target = target.queryParameter("g", group);
		return this;
	}

	public GavcSearchBuilder artifact(String artifact) {
		target = target.queryParameter("a", artifact);
		return this;
	}

	public GavcSearchBuilder version(String version) {
		target = target.queryParameter("v", version);
		return this;
	}

	public GavcSearchBuilder classifier(String classifier) {
		target = target.queryParameter("c", classifier);
		return this;
	}

	@Override
	public void formatRequest() throws IOException {
		
		super.formatRequest();
	}



}