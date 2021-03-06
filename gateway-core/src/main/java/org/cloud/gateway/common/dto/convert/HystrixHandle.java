package org.cloud.gateway.common.dto.convert;

import lombok.Getter;
import lombok.Setter;
import org.cloud.gateway.common.constant.Constants;

/**
 * this is hystrix handle.
 *
 * @author xiaoyu(Myth)
 */
@Getter
@Setter
public class HystrixHandle {

    /**
     * hystrix group key is required.
     */
    private String groupKey;

    /**
     * hystrix command key is required.
     */
    private String commandKey;

    /**
     * hystrix withExecutionIsolationSemaphoreMaxConcurrentRequests.
     */
    private int maxConcurrentRequests = Constants.MAX_CONCURRENT_REQUESTS;

    /**
     * hystrix withCircuitBreakerErrorThresholdPercentage.
     */
    private int errorThresholdPercentage = Constants.ERROR_THRESHOLD_PERCENTAGE;

    /**
     * hystrix withCircuitBreakerRequestVolumeThreshold.
     */
    private int requestVolumeThreshold = Constants.REQUEST_VOLUME_THRESHOLD;

    /**
     * hystrix withCircuitBreakerSleepWindowInMilliseconds.
     */
    private int sleepWindowInMilliseconds = Constants.SLEEP_WINDOW_INMILLISECONDS;

    /**
     * timeout is required.
     */
    private Integer timeout = Constants.TIME_OUT;
}
