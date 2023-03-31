package p403y6;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* renamed from: y6.d */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public class C13056d {

    /* renamed from: a */
    private final boolean f47302a;

    /* renamed from: b */
    private final String f47303b;

    /* renamed from: c */
    private final C13049a f47304c;

    /* renamed from: y6.d$a */
    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    public static final class C13057a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f47305a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f47306b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C13049a f47307c;

        @RecentlyNonNull
        /* renamed from: a */
        public C13056d mo38089a() {
            return new C13056d(this, (C13063h) null);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C13057a mo38090b(C13049a aVar) {
            this.f47307c = aVar;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C13057a mo38091c(boolean z) {
            this.f47305a = z;
            return this;
        }
    }

    /* synthetic */ C13056d(C13057a aVar, C13063h hVar) {
        this.f47302a = aVar.f47305a;
        this.f47303b = aVar.f47306b;
        this.f47304c = aVar.f47307c;
    }

    @RecentlyNullable
    /* renamed from: a */
    public C13049a mo38086a() {
        return this.f47304c;
    }

    /* renamed from: b */
    public boolean mo38087b() {
        return this.f47302a;
    }

    @RecentlyNullable
    /* renamed from: c */
    public final String mo38088c() {
        return this.f47303b;
    }
}
