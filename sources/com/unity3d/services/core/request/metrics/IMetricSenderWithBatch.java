package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.properties.InitializationStatusReader;

public abstract class IMetricSenderWithBatch extends MetricSenderBase {
    public IMetricSenderWithBatch(InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
    }

    public /* bridge */ /* synthetic */ void sendMetricWithInitState(Metric metric) {
        super.sendMetricWithInitState(metric);
    }

    /* access modifiers changed from: package-private */
    public abstract void sendQueueIfNeeded();

    /* access modifiers changed from: package-private */
    public abstract void updateOriginal(ISDKMetrics iSDKMetrics);
}
