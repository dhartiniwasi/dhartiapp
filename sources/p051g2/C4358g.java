package p051g2;

import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5961r;
import p177z1.C6272r1;
import p190b7.C6685q;

/* renamed from: g2.g */
/* compiled from: StreamFormatChunk */
final class C4358g implements C4349a {

    /* renamed from: a */
    public final C6272r1 f24306a;

    public C4358g(C6272r1 r1Var) {
        this.f24306a = r1Var;
    }

    /* renamed from: a */
    private static String m29002a(int i) {
        switch (i) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    /* renamed from: b */
    private static String m29003b(int i) {
        if (i == 1) {
            return "audio/raw";
        }
        if (i == 85) {
            return "audio/mpeg";
        }
        if (i == 255) {
            return "audio/mp4a-latm";
        }
        if (i == 8192) {
            return "audio/ac3";
        }
        if (i != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    /* renamed from: c */
    private static C4349a m29004c(C5918a0 a0Var) {
        a0Var.mo20547P(4);
        int p = a0Var.mo20563p();
        int p2 = a0Var.mo20563p();
        a0Var.mo20547P(4);
        int p3 = a0Var.mo20563p();
        String a = m29002a(p3);
        if (a == null) {
            C5961r.m35215i("StreamFormatChunk", "Ignoring track with unsupported compression " + p3);
            return null;
        }
        C6272r1.C6274b bVar = new C6272r1.C6274b();
        bVar.mo21522j0(p).mo21503Q(p2).mo21517e0(a);
        return new C4358g(bVar.mo21491E());
    }

    /* renamed from: d */
    public static C4349a m29005d(int i, C5918a0 a0Var) {
        if (i == 2) {
            return m29004c(a0Var);
        }
        if (i == 1) {
            return m29006e(a0Var);
        }
        C5961r.m35215i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + C5953m0.m35141k0(i));
        return null;
    }

    /* renamed from: e */
    private static C4349a m29006e(C5918a0 a0Var) {
        int u = a0Var.mo20568u();
        String b = m29003b(u);
        if (b == null) {
            C5961r.m35215i("StreamFormatChunk", "Ignoring track with unsupported format tag " + u);
            return null;
        }
        int u2 = a0Var.mo20568u();
        int p = a0Var.mo20563p();
        a0Var.mo20547P(6);
        int b0 = C5953m0.m35123b0(a0Var.mo20540I());
        int u3 = a0Var.mo20568u();
        byte[] bArr = new byte[u3];
        a0Var.mo20557j(bArr, 0, u3);
        C6272r1.C6274b bVar = new C6272r1.C6274b();
        bVar.mo21517e0(b).mo21494H(u2).mo21518f0(p);
        if ("audio/raw".equals(b) && b0 != 0) {
            bVar.mo21511Y(b0);
        }
        if ("audio/mp4a-latm".equals(b) && u3 > 0) {
            bVar.mo21506T(C6685q.m38446y(bArr));
        }
        return new C4358g(bVar.mo21491E());
    }

    public int getType() {
        return 1718776947;
    }
}
