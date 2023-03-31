package androidx.media;

import android.media.VolumeProvider;
import android.os.Build;

/* renamed from: androidx.media.l */
/* compiled from: VolumeProviderCompat */
public abstract class C1308l {

    /* renamed from: a */
    private final int f3532a;

    /* renamed from: b */
    private final int f3533b;

    /* renamed from: c */
    private final String f3534c;

    /* renamed from: d */
    private int f3535d;

    /* renamed from: e */
    private C1312d f3536e;

    /* renamed from: f */
    private VolumeProvider f3537f;

    /* renamed from: androidx.media.l$a */
    /* compiled from: VolumeProviderCompat */
    class C1309a extends VolumeProvider {
        C1309a(int i, int i2, int i3, String str) {
            super(i, i2, i3, str);
        }

        public void onAdjustVolume(int i) {
            C1308l.this.mo4622e(i);
        }

        public void onSetVolumeTo(int i) {
            C1308l.this.mo4623f(i);
        }
    }

    /* renamed from: androidx.media.l$b */
    /* compiled from: VolumeProviderCompat */
    class C1310b extends VolumeProvider {
        C1310b(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        public void onAdjustVolume(int i) {
            C1308l.this.mo4622e(i);
        }

        public void onSetVolumeTo(int i) {
            C1308l.this.mo4623f(i);
        }
    }

    /* renamed from: androidx.media.l$c */
    /* compiled from: VolumeProviderCompat */
    private static class C1311c {
        /* renamed from: a */
        static void m5695a(VolumeProvider volumeProvider, int i) {
            volumeProvider.setCurrentVolume(i);
        }
    }

    /* renamed from: androidx.media.l$d */
    /* compiled from: VolumeProviderCompat */
    public static abstract class C1312d {
        /* renamed from: a */
        public abstract void mo648a(C1308l lVar);
    }

    public C1308l(int i, int i2, int i3) {
        this(i, i2, i3, (String) null);
    }

    /* renamed from: a */
    public final int mo4618a() {
        return this.f3535d;
    }

    /* renamed from: b */
    public final int mo4619b() {
        return this.f3533b;
    }

    /* renamed from: c */
    public final int mo4620c() {
        return this.f3532a;
    }

    /* renamed from: d */
    public Object mo4621d() {
        if (this.f3537f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f3537f = new C1309a(this.f3532a, this.f3533b, this.f3535d, this.f3534c);
            } else if (i >= 21) {
                this.f3537f = new C1310b(this.f3532a, this.f3533b, this.f3535d);
            }
        }
        return this.f3537f;
    }

    /* renamed from: e */
    public abstract void mo4622e(int i);

    /* renamed from: f */
    public abstract void mo4623f(int i);

    /* renamed from: g */
    public void mo4624g(C1312d dVar) {
        this.f3536e = dVar;
    }

    /* renamed from: h */
    public final void mo4625h(int i) {
        this.f3535d = i;
        if (Build.VERSION.SDK_INT >= 21) {
            C1311c.m5695a((VolumeProvider) mo4621d(), i);
        }
        C1312d dVar = this.f3536e;
        if (dVar != null) {
            dVar.mo648a(this);
        }
    }

    public C1308l(int i, int i2, int i3, String str) {
        this.f3532a = i;
        this.f3533b = i2;
        this.f3535d = i3;
        this.f3534c = str;
    }
}
