package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.C0744f;
import androidx.core.util.C0831h;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.provider.g */
/* compiled from: FontsContractCompat */
public class C0795g {

    /* renamed from: androidx.core.provider.g$a */
    /* compiled from: FontsContractCompat */
    public static class C0796a {

        /* renamed from: a */
        private final int f2377a;

        /* renamed from: b */
        private final C0797b[] f2378b;

        @Deprecated
        public C0796a(int i, C0797b[] bVarArr) {
            this.f2377a = i;
            this.f2378b = bVarArr;
        }

        /* renamed from: a */
        static C0796a m3574a(int i, C0797b[] bVarArr) {
            return new C0796a(i, bVarArr);
        }

        /* renamed from: b */
        public C0797b[] mo3175b() {
            return this.f2378b;
        }

        /* renamed from: c */
        public int mo3176c() {
            return this.f2377a;
        }
    }

    /* renamed from: androidx.core.provider.g$b */
    /* compiled from: FontsContractCompat */
    public static class C0797b {

        /* renamed from: a */
        private final Uri f2379a;

        /* renamed from: b */
        private final int f2380b;

        /* renamed from: c */
        private final int f2381c;

        /* renamed from: d */
        private final boolean f2382d;

        /* renamed from: e */
        private final int f2383e;

        @Deprecated
        public C0797b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f2379a = (Uri) C0831h.m3662f(uri);
            this.f2380b = i;
            this.f2381c = i2;
            this.f2382d = z;
            this.f2383e = i3;
        }

        /* renamed from: a */
        static C0797b m3577a(Uri uri, int i, int i2, boolean z, int i3) {
            return new C0797b(uri, i, i2, z, i3);
        }

        /* renamed from: b */
        public int mo3177b() {
            return this.f2383e;
        }

        /* renamed from: c */
        public int mo3178c() {
            return this.f2380b;
        }

        /* renamed from: d */
        public Uri mo3179d() {
            return this.f2379a;
        }

        /* renamed from: e */
        public int mo3180e() {
            return this.f2381c;
        }

        /* renamed from: f */
        public boolean mo3181f() {
            return this.f2382d;
        }
    }

    /* renamed from: androidx.core.provider.g$c */
    /* compiled from: FontsContractCompat */
    public static class C0798c {
        /* renamed from: a */
        public void mo3117a(int i) {
            throw null;
        }

        /* renamed from: b */
        public void mo3118b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m3571a(Context context, CancellationSignal cancellationSignal, C0797b[] bVarArr) {
        return C0744f.m3424b(context, cancellationSignal, bVarArr, 0);
    }

    /* renamed from: b */
    public static C0796a m3572b(Context context, CancellationSignal cancellationSignal, C0788e eVar) throws PackageManager.NameNotFoundException {
        return C0786d.m3549e(context, eVar, cancellationSignal);
    }

    /* renamed from: c */
    public static Typeface m3573c(Context context, C0788e eVar, int i, boolean z, int i2, Handler handler, C0798c cVar) {
        C0781a aVar = new C0781a(cVar, handler);
        if (z) {
            return C0789f.m3565e(context, eVar, aVar, i, i2);
        }
        return C0789f.m3564d(context, eVar, i, (Executor) null, aVar);
    }
}
