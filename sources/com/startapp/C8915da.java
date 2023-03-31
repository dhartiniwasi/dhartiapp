package com.startapp;

import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.results.speedtest.MeasurementPointLatency;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.startapp.da */
/* compiled from: Sta */
public class C8915da {
    /* renamed from: a */
    public static int m48518a(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        if (list.size() == 1) {
            return list.get(0).intValue();
        }
        long j = 0;
        for (int i = 0; i < list.size(); i++) {
            j += (long) list.get(i).intValue();
        }
        return Math.round((float) (j / ((long) list.size())));
    }

    /* renamed from: b */
    public static double m48520b(List<Integer> list) {
        long j = 0;
        for (int i = 0; i < list.size(); i++) {
            j += (long) list.get(i).intValue();
        }
        double size = ((double) j) / ((double) list.size());
        double d = 0.0d;
        for (int i2 = 0; i2 < list.size(); i2++) {
            d += Math.pow(((double) list.get(i2).intValue()) - size, 2.0d);
        }
        double sqrt = Math.sqrt(d / ((double) list.size()));
        if (Double.isNaN(sqrt)) {
            return 0.0d;
        }
        return sqrt;
    }

    /* renamed from: c */
    public static int m48522c(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        if (list.size() == 1) {
            return list.get(0).intValue();
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).intValue() > i) {
                i = list.get(i2).intValue();
            }
        }
        return i;
    }

    /* renamed from: d */
    public static int m48523d(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        if (list.size() == 1) {
            return list.get(0).intValue();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(list.get(i));
        }
        Collections.sort(arrayList);
        if (arrayList.size() % 2 == 0) {
            return (int) Math.round((((double) ((Integer) arrayList.get(arrayList.size() / 2)).intValue()) + ((double) ((Integer) arrayList.get((arrayList.size() / 2) - 1)).intValue())) / 2.0d);
        }
        return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
    }

    /* renamed from: e */
    public static int m48524e(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        if (list.size() == 1) {
            return list.get(0).intValue();
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).intValue() < i) {
                i = list.get(i2).intValue();
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m48517a(ArrayList<Integer> arrayList, int i) {
        long round;
        int size = arrayList.size();
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return arrayList.get(0).intValue();
        }
        int i2 = size - 1;
        double d = (((double) i) / 100.0d) * ((double) i2);
        int i3 = (int) d;
        double intValue = (double) arrayList.get(i3).intValue();
        double d2 = d - ((double) i3);
        if (i3 == i2 || d2 == 0.0d) {
            round = Math.round(intValue);
        } else {
            round = Math.round(((((double) arrayList.get(i3 + 1).intValue()) - intValue) * d2) + intValue);
        }
        return (int) round;
    }

    /* renamed from: b */
    public static void m48521b(ArrayList<?> arrayList, int i) {
        arrayList.ensureCapacity(i);
        while (arrayList.size() < i) {
            arrayList.add((Object) null);
        }
    }

    /* renamed from: a */
    public static MeasurementPointLatency m48519a(long j, RadioInfo radioInfo, long j2) {
        MeasurementPointLatency measurementPointLatency = new MeasurementPointLatency();
        measurementPointLatency.Rtt = (int) j;
        measurementPointLatency.ConnectionType = radioInfo.ConnectionType;
        measurementPointLatency.NetworkType = radioInfo.NetworkType;
        measurementPointLatency.RxLev = radioInfo.RXLevel;
        measurementPointLatency.Delta = j2;
        return measurementPointLatency;
    }
}
