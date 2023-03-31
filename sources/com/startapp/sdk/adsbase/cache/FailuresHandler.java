package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class FailuresHandler implements Serializable {
    private static final long serialVersionUID = -4588601967418450964L;
    private boolean infiniteLastRetry = true;
    @C9226pb(type = ArrayList.class, value = Integer.class)
    private List<Integer> intervals = Arrays.asList(new Integer[]{10, 30, 60, 300});

    /* renamed from: a */
    public List<Integer> mo30691a() {
        return this.intervals;
    }

    /* renamed from: b */
    public boolean mo30692b() {
        return this.infiniteLastRetry;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FailuresHandler failuresHandler = (FailuresHandler) obj;
        if (this.infiniteLastRetry != failuresHandler.infiniteLastRetry || !C9605vb.m50465a(this.intervals, failuresHandler.intervals)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.intervals, Boolean.valueOf(this.infiniteLastRetry)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
