package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.za */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class C3099za implements C2172ab {

    /* renamed from: b */
    private static final Logger f21036b = Logger.getLogger(C3099za.class.getName());

    /* renamed from: a */
    final ThreadLocal f21037a = new C3062ya(this);

    /* renamed from: a */
    public final C2283db mo8296a(m34 m34, C2320eb ebVar) throws IOException {
        int r1;
        long j;
        long d = m34.mo12271d();
        ((ByteBuffer) this.f21037a.get()).rewind().limit(8);
        do {
            r1 = m34.mo12274r1((ByteBuffer) this.f21037a.get());
            if (r1 == 8) {
                ((ByteBuffer) this.f21037a.get()).rewind();
                long e = C2246cb.m10817e((ByteBuffer) this.f21037a.get());
                byte[] bArr = null;
                if (e >= 8 || e <= 1) {
                    byte[] bArr2 = new byte[4];
                    ((ByteBuffer) this.f21037a.get()).get(bArr2);
                    try {
                        String str = new String(bArr2, "ISO-8859-1");
                        if (e == 1) {
                            ((ByteBuffer) this.f21037a.get()).limit(16);
                            m34.mo12274r1((ByteBuffer) this.f21037a.get());
                            ((ByteBuffer) this.f21037a.get()).position(8);
                            j = C2246cb.m10818f((ByteBuffer) this.f21037a.get()) - 16;
                        } else {
                            j = e == 0 ? m34.mo12272e() - m34.mo12271d() : e - 8;
                        }
                        if ("uuid".equals(str)) {
                            ((ByteBuffer) this.f21037a.get()).limit(((ByteBuffer) this.f21037a.get()).limit() + 16);
                            m34.mo12274r1((ByteBuffer) this.f21037a.get());
                            bArr = new byte[16];
                            for (int position = ((ByteBuffer) this.f21037a.get()).position() - 16; position < ((ByteBuffer) this.f21037a.get()).position(); position++) {
                                bArr[position - (((ByteBuffer) this.f21037a.get()).position() - 16)] = ((ByteBuffer) this.f21037a.get()).get(position);
                            }
                            j -= 16;
                        }
                        long j2 = j;
                        C2283db b = mo14119b(str, bArr, ebVar instanceof C2283db ? ((C2283db) ebVar).zza() : "");
                        b.mo9499f(ebVar);
                        ((ByteBuffer) this.f21037a.get()).rewind();
                        b.mo9498a(m34, (ByteBuffer) this.f21037a.get(), j2, this);
                        return b;
                    } catch (UnsupportedEncodingException e2) {
                        throw new RuntimeException(e2);
                    }
                } else {
                    Logger logger = f21036b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(e);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
            }
        } while (r1 >= 0);
        m34.mo12273l(d);
        throw new EOFException();
    }

    /* renamed from: b */
    public abstract C2283db mo14119b(String str, byte[] bArr, String str2);
}
