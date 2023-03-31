package p141t2;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p127r2.C5432a;
import p127r2.C5439e;
import p127r2.C5442h;
import p161w3.C5917a;
import p161w3.C5918a0;

/* renamed from: t2.b */
/* compiled from: EventMessageDecoder */
public final class C5509b extends C5442h {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C5432a mo19711b(C5439e eVar, ByteBuffer byteBuffer) {
        return new C5432a(mo19790c(new C5918a0(byteBuffer.array(), byteBuffer.limit())));
    }

    /* renamed from: c */
    public C5507a mo19790c(C5918a0 a0Var) {
        return new C5507a((String) C5917a.m34872e(a0Var.mo20570w()), (String) C5917a.m34872e(a0Var.mo20570w()), a0Var.mo20569v(), a0Var.mo20569v(), Arrays.copyOfRange(a0Var.mo20551d(), a0Var.mo20552e(), a0Var.mo20553f()));
    }
}
