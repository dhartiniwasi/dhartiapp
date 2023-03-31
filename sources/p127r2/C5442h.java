package p127r2;

import java.nio.ByteBuffer;
import p161w3.C5917a;

/* renamed from: r2.h */
/* compiled from: SimpleMetadataDecoder */
public abstract class C5442h implements C5436c {
    /* renamed from: a */
    public final C5432a mo19706a(C5439e eVar) {
        ByteBuffer byteBuffer = (ByteBuffer) C5917a.m34872e(eVar.f5430c);
        C5917a.m34868a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eVar.mo7033r()) {
            return null;
        }
        return mo19711b(eVar, byteBuffer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C5432a mo19711b(C5439e eVar, ByteBuffer byteBuffer);
}
