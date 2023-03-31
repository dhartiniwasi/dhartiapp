package p364u5;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import p007a5.C0106c;
import p007a5.C0111g;
import p411z5.C13447d;
import p411z5.C13451f;

/* renamed from: u5.j */
public class C12689j implements C13447d {

    /* renamed from: u5.j$a */
    static class C12690a implements C13447d.C13449b {

        /* renamed from: a */
        private final Status f46452a;

        /* renamed from: b */
        private final C13451f f46453b;

        public C12690a(Status status, C13451f fVar) {
            this.f46452a = status;
            this.f46453b = fVar;
        }

        /* renamed from: d1 */
        public final Status mo259d1() {
            return this.f46452a;
        }

        /* renamed from: m1 */
        public final String mo37566m1() {
            C13451f fVar = this.f46453b;
            if (fVar == null) {
                return null;
            }
            return fVar.mo38541m1();
        }
    }

    /* renamed from: u5.j$b */
    static abstract class C12691b extends C12684e<C13447d.C13449b> {

        /* renamed from: t */
        protected C12685f f46454t = new C12693l(this);

        public C12691b(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public /* synthetic */ C0111g mo7990d(Status status) {
            return new C12690a(status, (C13451f) null);
        }
    }

    /* renamed from: a */
    public static C0106c<C13447d.C13449b> m60213a(GoogleApiClient googleApiClient, byte[] bArr, String str) {
        return googleApiClient.mo6989e(new C12692k(googleApiClient, bArr, str));
    }
}
