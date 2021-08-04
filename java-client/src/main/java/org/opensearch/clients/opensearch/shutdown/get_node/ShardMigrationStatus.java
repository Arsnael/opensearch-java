/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.opensearch.shutdown.get_node;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;

// typedef: shutdown.get_node.ShardMigrationStatus
@JsonpDeserializable
public class ShardMigrationStatus implements JsonpSerializable {
	private final ShutdownStatus status;

	// ---------------------------------------------------------------------------------------------

	private ShardMigrationStatus(Builder builder) {

		this.status = ModelTypeHelper.requireNonNull(builder.status, this, "status");

	}

	public static ShardMigrationStatus of(Function<Builder, ObjectBuilder<ShardMigrationStatus>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final ShutdownStatus status() {
		return this.status;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardMigrationStatus}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ShardMigrationStatus> {
		private ShutdownStatus status;

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(ShutdownStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * Builds a {@link ShardMigrationStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardMigrationStatus build() {
			_checkSingleUse();

			return new ShardMigrationStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardMigrationStatus}
	 */
	public static final JsonpDeserializer<ShardMigrationStatus> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ShardMigrationStatus::setupShardMigrationStatusDeserializer, Builder::build);

	protected static void setupShardMigrationStatusDeserializer(
			DelegatingDeserializer<ShardMigrationStatus.Builder> op) {

		op.add(Builder::status, ShutdownStatus._DESERIALIZER, "status");

	}

}