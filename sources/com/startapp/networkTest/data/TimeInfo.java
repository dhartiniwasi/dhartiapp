package com.startapp.networkTest.data;

import com.startapp.C9040j2;
import com.startapp.C9060k2;
import com.startapp.networkTest.enums.TimeSources;
import java.io.Serializable;
import java.util.TimeZone;

/* compiled from: Sta */
public class TimeInfo implements Cloneable, Serializable {
    private static final long serialVersionUID = 3793653153982296400L;
    public long DeviceDriftMillis;
    public boolean IsSynced;
    public long MillisSinceLastSync;
    public TimeSources TimeSource = TimeSources.Unknown;
    public String TimestampDateTime = "";
    public long TimestampMillis;
    public double TimestampOffset;
    public String TimestampTableau = "";
    public transient int day;
    public transient int hour;
    public transient int millisecond;
    public transient int minute;
    public transient int month;
    public transient int second;
    public transient int year;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setMillis(long j) {
        this.TimestampTableau = C9060k2.m48736b(j);
        this.TimestampDateTime = C9060k2.m48732a(j);
        this.TimestampOffset = (double) (((((float) TimeZone.getDefault().getOffset(j)) / 1000.0f) / 60.0f) / 60.0f);
        this.TimestampMillis = j;
        C9040j2 c = C9060k2.m48737c(j);
        this.year = c.f36981a;
        this.month = c.f36982b;
        this.day = c.f36983c;
        this.hour = c.f36984d;
        this.minute = c.f36985e;
        this.second = c.f36986f;
        this.millisecond = c.f36987g;
    }
}
