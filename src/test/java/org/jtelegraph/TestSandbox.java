/*
 *   JTelegraph -- a Java message notification library
 *   Copyright (c) 2012, Paulo Roberto Massa Cereda
 *   All rights reserved.
 *
 *   Redistribution and use in source and binary forms, with or without
 *   modification, are permitted provided that the following conditions
 *   are met:
 *
 *   1. Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 *   2. Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 *   3. Neither the name of the project's author nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 *
 *   THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 *   "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 *   LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 *   FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 *   COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 *   INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 *   BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 *   LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 *   CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 *   LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 *   WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 *   POSSIBILITY OF SUCH DAMAGE.
 */
package org.jtelegraph;

import java.awt.Color;

import org.junit.Test;

/**
 * This test class allows to store various test cases uses during the
 * development in order to validate that everything's ok... Nothing really
 * clean, I know it's not a proper way of testing something... Maybe when I'll
 * have more time I'll take some time to write tests...
 * 
 * @author Antoine Neveux
 * @since 2.1
 * @version 2.1
 */
public class TestSandbox {

	@Test
	public void test1() throws Exception {
		final TelegraphQueue queue = new TelegraphQueue();
		final TelegraphConfig c = new TelegraphConfig();
		c.setButtonEnabled(true);
		final Telegraph t = new Telegraph("Test",
				"Hey! Look at my first test!", c);
		final Telegraph t3 = new Telegraph("Test3",
				"Hey! Look at my third test!");
		final Telegraph t2 = new Telegraph("Test2",
				"Hey! Look at my second test!", new TelegraphConfigBuilder()
						.withBorderColor(Color.RED).withBorderThickness(5)
						.build());
		queue.add(t);
		queue.add(t3);
		queue.add(t2);
		queue.join();
	}
}
