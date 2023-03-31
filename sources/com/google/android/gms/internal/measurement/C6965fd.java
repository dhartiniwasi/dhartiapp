package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fd */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C6965fd implements C6948ed {

    /* renamed from: a */
    public static final C6908c7 f31691a;

    /* renamed from: b */
    public static final C6908c7 f31692b;

    /* renamed from: c */
    public static final C6908c7 f31693c;

    /* renamed from: d */
    public static final C6908c7 f31694d;

    static {
        C7264y6 a = new C7264y6(C7136q6.m40654a("com.google.android.gms.measurement")).mo24015a();
        f31691a = a.mo24020f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f31692b = a.mo24020f("measurement.audience.refresh_event_count_filters_timestamp", false);
        f31693c = a.mo24020f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f31694d = a.mo24020f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    /* renamed from: b */
    public final boolean mo23364b() {
        return ((Boolean) f31694d.mo23250b()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo23365d() {
        return ((Boolean) f31692b.mo23250b()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo23366e() {
        return ((Boolean) f31693c.mo23250b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
