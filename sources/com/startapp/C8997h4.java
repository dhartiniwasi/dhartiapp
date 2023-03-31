package com.startapp;

import android.content.Context;
import android.net.Uri;
import com.startapp.C9219p7;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.ImpressionsTrackingMetadata;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.startapp.h4 */
/* compiled from: Sta */
public class C8997h4 implements C8873c3<String, C9219p7.C9220a, Throwable, Void> {

    /* renamed from: a */
    public final Context f36891a;

    /* renamed from: b */
    public final List<String> f36892b;

    /* renamed from: c */
    public final TrackingParams f36893c;

    /* renamed from: d */
    public final C8908d3<ImpressionsTrackingMetadata> f36894d;

    /* renamed from: e */
    public final Map<String, Pair<Integer, String>> f36895e;

    /* renamed from: f */
    public final AtomicInteger f36896f;

    /* renamed from: g */
    public AtomicReference<ImpressionsTrackingMetadata> f36897g;

    /* renamed from: h */
    public String f36898h;

    public C8997h4(Context context, List<String> list, TrackingParams trackingParams, C8908d3<ImpressionsTrackingMetadata> d3Var) {
        this.f36891a = context;
        this.f36892b = list;
        this.f36893c = trackingParams;
        this.f36894d = d3Var;
        this.f36895e = Collections.synchronizedMap(new LinkedHashMap(list.size()));
        this.f36896f = new AtomicInteger(list.size());
    }

    /* renamed from: a */
    public Object mo29242a(Object obj, Object obj2, Object obj3) {
        Pair pair;
        String str = (String) obj;
        Throwable th = (Throwable) obj3;
        if (((C9219p7.C9220a) obj2) != null) {
            pair = new Pair(4, String.valueOf(200));
        } else {
            if (th instanceof SDKException) {
                SDKException sDKException = (SDKException) th;
                if (sDKException.mo31155a() > 0) {
                    pair = new Pair(1, String.valueOf(sDKException.mo31155a()));
                } else {
                    th = th.getCause();
                }
            }
            pair = null;
        }
        if (pair == null) {
            if (th != null) {
                pair = new Pair(2, th.getClass().getName());
            } else {
                pair = new Pair(2, String.valueOf(-1));
            }
        }
        this.f36895e.put(str, pair);
        mo29448a();
        return null;
    }

    /* renamed from: a */
    public static void m48658a(Context context, List<String> list, TrackingParams trackingParams) {
        C8997h4 h4Var = (C8997h4) ComponentLocator.m50248a(context).f39030J.mo29904a().mo29242a(context, list, trackingParams);
        if (h4Var != null) {
            C9605vb.m50457a(h4Var.f36891a, 4, "Sending impression", true);
            for (String next : h4Var.f36892b) {
                if (next == null || next.length() <= 0) {
                    h4Var.f36895e.put(next, (Object) null);
                    h4Var.mo29448a();
                } else {
                    if (h4Var.f36898h == null) {
                        h4Var.f36898h = C9396a.m49774a(next, (String) null);
                    }
                    Pair<String, Boolean> a = C8893cb.m48468a(h4Var.f36891a, next, h4Var.f36893c, (C8873c3<String, C9219p7.C9220a, Throwable, Void>) h4Var);
                    boolean equals = Boolean.TRUE.equals(a.second);
                    h4Var.f36895e.put((String) a.first, (Object) null);
                    if (!equals) {
                        h4Var.mo29448a();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo29448a() {
        String str;
        if (this.f36896f.decrementAndGet() == 0) {
            AtomicReference<ImpressionsTrackingMetadata> atomicReference = this.f36897g;
            String str2 = null;
            if (atomicReference == null) {
                ImpressionsTrackingMetadata call = this.f36894d.call();
                if (call == null || call.mo30978a() <= Math.random()) {
                    call = null;
                }
                AtomicReference<ImpressionsTrackingMetadata> atomicReference2 = new AtomicReference<>(call);
                this.f36897g = atomicReference2;
                atomicReference = atomicReference2;
            }
            ImpressionsTrackingMetadata impressionsTrackingMetadata = atomicReference.get();
            if (impressionsTrackingMetadata != null) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                boolean z = false;
                String str3 = "";
                for (Map.Entry next : this.f36895e.entrySet()) {
                    Integer num = next.getValue() != null ? (Integer) ((Pair) next.getValue()).first : 2;
                    if (num != null && (impressionsTrackingMetadata.mo30979b() & num.intValue()) == num.intValue()) {
                        String valueOf = next.getValue() != null ? (String) ((Pair) next.getValue()).second : String.valueOf(-2);
                        String str4 = (String) next.getKey();
                        sb.append(str3);
                        sb.append(valueOf);
                        sb2.append(str3);
                        if (str4 != null) {
                            try {
                                Uri parse = Uri.parse(str4);
                                str = parse.getAuthority() + parse.getPath();
                            } catch (Throwable th) {
                                str = th.getClass().getName();
                            }
                        } else {
                            str = String.valueOf((char[]) null);
                        }
                        sb2.append(str);
                        z = true;
                        str3 = ",";
                    }
                }
                if (z) {
                    C9023i4 i4Var = new C9023i4(C9043j4.f37002m);
                    i4Var.f36953e = sb + ";" + sb2;
                    i4Var.f36955g = this.f36898h;
                    StringBuilder a = C8870c1.m48422a("adTag: ");
                    TrackingParams trackingParams = this.f36893c;
                    if (trackingParams != null) {
                        str2 = trackingParams.mo30722a();
                    }
                    a.append(str2);
                    i4Var.f36952d = a.toString();
                    i4Var.mo29471a();
                }
            }
        }
    }
}
