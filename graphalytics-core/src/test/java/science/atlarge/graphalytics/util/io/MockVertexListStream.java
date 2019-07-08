/*
 * Copyright 2015 - 2017 Atlarge Research Team,
 * operating at Technische Universiteit Delft
 * and Vrije Universiteit Amsterdam, the Netherlands.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package science.atlarge.graphalytics.util.io;

import java.io.IOException;
import java.util.Arrays;

/**
 * Mock implementation of VertexListStream backed by an array of vertices.
 *
 * @author Mihai Capotă
 * @author Tim Hegeman
 * @author Wing Lung Ngai
 */
public class MockVertexListStream implements VertexListStream {

	private final VertexData[] vertices;
	private int index;

	public MockVertexListStream(VertexData[] vertices) {
		this.vertices = Arrays.copyOf(vertices, vertices.length);
		this.index = -1;
	}

	@Override
	public boolean hasNextVertex() throws IOException {
		return index + 1 < vertices.length;
	}

	@Override
	public VertexData getNextVertex() throws IOException {
		index++;
		return vertices[index];
	}

	@Override
	public void close() throws IOException {
	}

}
