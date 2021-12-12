/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

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

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */
//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch._types.aggregations;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.DateRangeAggregation
@JsonpDeserializable
public class DateRangeAggregation extends BucketAggregationBase implements AggregationVariant {
	@Nullable
	private final String field;

	@Nullable
	private final String format;

	@Nullable
	private final String missing;

	private final List<DateRangeExpression> ranges;

	@Nullable
	private final String timeZone;

	@Nullable
	private final Boolean keyed;

	// ---------------------------------------------------------------------------------------------

	private DateRangeAggregation(Builder builder) {
		super(builder);

		this.field = builder.field;
		this.format = builder.format;
		this.missing = builder.missing;
		this.ranges = ModelTypeHelper.unmodifiable(builder.ranges);
		this.timeZone = builder.timeZone;
		this.keyed = builder.keyed;

	}

	public static DateRangeAggregation of(Function<Builder, ObjectBuilder<DateRangeAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "date_range";
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public final String missing() {
		return this.missing;
	}

	/**
	 * API name: {@code ranges}
	 */
	public final List<DateRangeExpression> ranges() {
		return this.ranges;
	}

	/**
	 * API name: {@code time_zone}
	 */
	@Nullable
	public final String timeZone() {
		return this.timeZone;
	}

	/**
	 * API name: {@code keyed}
	 */
	@Nullable
	public final Boolean keyed() {
		return this.keyed;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.field != null) {
			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.format != null) {
			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.missing != null) {
			generator.writeKey("missing");
			generator.write(this.missing);

		}
		if (ModelTypeHelper.isDefined(this.ranges)) {
			generator.writeKey("ranges");
			generator.writeStartArray();
			for (DateRangeExpression item0 : this.ranges) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.timeZone != null) {
			generator.writeKey("time_zone");
			generator.write(this.timeZone);

		}
		if (this.keyed != null) {
			generator.writeKey("keyed");
			generator.write(this.keyed);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DateRangeAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DateRangeAggregation> {
		@Nullable
		private String field;

		@Nullable
		private String format;

		@Nullable
		private String missing;

		@Nullable
		private List<DateRangeExpression> ranges;

		@Nullable
		private String timeZone;

		@Nullable
		private Boolean keyed;

		/**
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(@Nullable String value) {
			this.missing = value;
			return this;
		}

		/**
		 * API name: {@code ranges}
		 */
		public final Builder ranges(@Nullable List<DateRangeExpression> value) {
			this.ranges = value;
			return this;
		}

		/**
		 * API name: {@code ranges}
		 */
		public final Builder ranges(DateRangeExpression... value) {
			this.ranges = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code ranges}
		 */
		@SafeVarargs
		public final Builder ranges(Function<DateRangeExpression.Builder, ObjectBuilder<DateRangeExpression>>... fns) {
			this.ranges = new ArrayList<>(fns.length);
			for (Function<DateRangeExpression.Builder, ObjectBuilder<DateRangeExpression>> fn : fns) {
				this.ranges.add(fn.apply(new DateRangeExpression.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code time_zone}
		 */
		public final Builder timeZone(@Nullable String value) {
			this.timeZone = value;
			return this;
		}

		/**
		 * API name: {@code keyed}
		 */
		public final Builder keyed(@Nullable Boolean value) {
			this.keyed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DateRangeAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateRangeAggregation build() {
			_checkSingleUse();

			return new DateRangeAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateRangeAggregation}
	 */
	public static final JsonpDeserializer<DateRangeAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DateRangeAggregation::setupDateRangeAggregationDeserializer, Builder::build);

	protected static void setupDateRangeAggregationDeserializer(
			DelegatingDeserializer<DateRangeAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::missing, JsonpDeserializer.stringDeserializer(), "missing");
		op.add(Builder::ranges, JsonpDeserializer.arrayDeserializer(DateRangeExpression._DESERIALIZER), "ranges");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");
		op.add(Builder::keyed, JsonpDeserializer.booleanDeserializer(), "keyed");

	}

}