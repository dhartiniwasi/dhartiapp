package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C8926e5;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class ConnectivityHelperMetadata implements Serializable {
    private static final long serialVersionUID = -3942031112402817295L;
    @C9226pb(complex = true)
    private Transport transport = new Transport();

    /* compiled from: Sta */
    public static class Transport implements Serializable {
        private static final long serialVersionUID = 9037003673849815220L;
        @C9226pb(parser = C8926e5.class)
        private int[][] active;
        @C9226pb(parser = C8926e5.class)
        private int[][] all = {new int[]{21, Integer.MAX_VALUE}};

        /* renamed from: a */
        public int[][] mo30974a() {
            return this.active;
        }

        /* renamed from: b */
        public int[][] mo30975b() {
            return this.all;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Transport transport = (Transport) obj;
            if (!Arrays.deepEquals(this.all, transport.all) || !Arrays.deepEquals(this.active, transport.active)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Object[] objArr = {this.all, this.active};
            Map<Activity, Integer> map = C9605vb.f39316a;
            return Arrays.deepHashCode(objArr);
        }
    }

    /* renamed from: a */
    public Transport mo30971a() {
        return this.transport;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C9605vb.m50465a(this.transport, ((ConnectivityHelperMetadata) obj).transport);
    }

    public int hashCode() {
        Object[] objArr = {this.transport};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
