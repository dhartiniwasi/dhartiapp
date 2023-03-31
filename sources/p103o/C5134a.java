package p103o;

import android.os.Bundle;

/* renamed from: o.a */
/* compiled from: TrustedWebActivityDisplayMode */
public interface C5134a {

    /* renamed from: o.a$a */
    /* compiled from: TrustedWebActivityDisplayMode */
    public static class C5135a implements C5134a {
        /* renamed from: a */
        public Bundle mo19099a() {
            Bundle bundle = new Bundle();
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
            return bundle;
        }
    }

    /* renamed from: o.a$b */
    /* compiled from: TrustedWebActivityDisplayMode */
    public static class C5136b implements C5134a {

        /* renamed from: a */
        private final boolean f26649a;

        /* renamed from: b */
        private final int f26650b;

        public C5136b(boolean z, int i) {
            this.f26649a = z;
            this.f26650b = i;
        }

        /* renamed from: a */
        public Bundle mo19099a() {
            Bundle bundle = new Bundle();
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
            bundle.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.f26649a);
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", this.f26650b);
            return bundle;
        }
    }

    /* renamed from: a */
    Bundle mo19099a();
}
