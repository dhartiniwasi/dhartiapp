package p141t2;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: t2.c */
/* compiled from: EventMessageEncoder */
public final class C5510c {

    /* renamed from: a */
    private final ByteArrayOutputStream f27985a;

    /* renamed from: b */
    private final DataOutputStream f27986b;

    public C5510c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f27985a = byteArrayOutputStream;
        this.f27986b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    private static void m33481b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public byte[] mo19791a(C5507a aVar) {
        this.f27985a.reset();
        try {
            m33481b(this.f27986b, aVar.f27979a);
            String str = aVar.f27980b;
            if (str == null) {
                str = "";
            }
            m33481b(this.f27986b, str);
            this.f27986b.writeLong(aVar.f27981c);
            this.f27986b.writeLong(aVar.f27982d);
            this.f27986b.write(aVar.f27983e);
            this.f27986b.flush();
            return this.f27985a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
