/*
 * Copyright (c) 2017, Apptentive, Inc. All Rights Reserved.
 * Please refer to the LICENSE file for the terms and conditions
 * under which redistribution and use of this file is permitted.
 */

package com.apptentive.android.sdk.network;

public interface HttpRequestRetryPolicy {
	boolean shouldRetryRequest(int responseCode, int retryAttempt);
	long getRetryTimeoutMillis(int retryAttempt);
}
