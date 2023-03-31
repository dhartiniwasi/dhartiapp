package p154v2;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p127r2.C5432a;
import p127r2.C5439e;
import p127r2.C5442h;
import p182a7.C6408b;
import p182a7.C6415d;

/* renamed from: v2.a */
/* compiled from: IcyDecoder */
public final class C5782a extends C5442h {

    /* renamed from: c */
    private static final Pattern f28767c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    private final CharsetDecoder f28768a = C6415d.f30664c.newDecoder();

    /* renamed from: b */
    private final CharsetDecoder f28769b = C6415d.f30663b.newDecoder();

    /* renamed from: c */
    private String m34507c(ByteBuffer byteBuffer) {
        try {
            return this.f28768a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                return this.f28769b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f28769b.reset();
                byteBuffer.rewind();
            }
        } finally {
            this.f28768a.reset();
            byteBuffer.rewind();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C5432a mo19711b(C5439e eVar, ByteBuffer byteBuffer) {
        String c = m34507c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c == null) {
            return new C5432a(new C5785c(bArr, (String) null, (String) null));
        }
        Matcher matcher = f28767c.matcher(c);
        String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String e = C6408b.m37506e(group);
                e.hashCode();
                if (e.equals("streamurl")) {
                    str2 = group2;
                } else if (e.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new C5432a(new C5785c(bArr, str, str2));
    }
}
