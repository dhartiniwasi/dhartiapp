package p246h7;

import p033d5.C4141r;

/* renamed from: h7.l */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C10421l extends Exception {
    @Deprecated
    protected C10421l() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10421l(String str) {
        super(str);
        C4141r.m28218h(str, "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10421l(String str, Throwable th) {
        super(str, th);
        C4141r.m28218h(str, "Detail message must not be empty");
    }
}
