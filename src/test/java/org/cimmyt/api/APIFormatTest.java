package org.cimmyt.api;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class APIFormatTest {

	@Test
	public void shouldSupportBrapi() throws Exception {
		assertThat(ApiFormat.BRAPI.toString()).isEqualTo("BRAPI");
		assertThat(ApiFormat.valueOf("BRAPI")).isEqualTo(ApiFormat.BRAPI);
	}

	@Test
	public void shouldSupportDal() throws Exception {
		assertThat(ApiFormat.DAL.toString()).isEqualTo("DAL");
		assertThat(ApiFormat.valueOf("DAL")).isEqualTo(ApiFormat.DAL);
	}
}
