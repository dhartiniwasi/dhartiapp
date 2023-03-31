package p403y6;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.List;
import p144t5.C5614z0;

/* renamed from: y6.a */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public class C13049a {

    /* renamed from: a */
    private final boolean f47296a;

    /* renamed from: b */
    private final int f47297b;

    /* renamed from: y6.a$a */
    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    public static class C13050a {

        /* renamed from: a */
        private final List<String> f47298a = new ArrayList();

        /* renamed from: b */
        private final Context f47299b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f47300c = 0;

        /* renamed from: d */
        private boolean f47301d;

        public C13050a(@RecentlyNonNull Context context) {
            this.f47299b = context.getApplicationContext();
        }

        @RecentlyNonNull
        /* renamed from: a */
        public C13050a mo38083a(@RecentlyNonNull String str) {
            this.f47298a.add(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C13049a mo38084b() {
            Context context = this.f47299b;
            List<String> list = this.f47298a;
            boolean z = true;
            if (!C5614z0.m33701b() && !list.contains(C5614z0.m33700a(context)) && !this.f47301d) {
                z = false;
            }
            return new C13049a(z, this, (C13062g) null);
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C13050a mo38085c(int i) {
            this.f47300c = i;
            return this;
        }
    }

    /* synthetic */ C13049a(boolean z, C13050a aVar, C13062g gVar) {
        this.f47296a = z;
        this.f47297b = aVar.f47300c;
    }

    /* renamed from: a */
    public int mo38081a() {
        return this.f47297b;
    }

    /* renamed from: b */
    public boolean mo38082b() {
        return this.f47296a;
    }
}
