package p127r2;

import p134s2.C5478b;
import p141t2.C5509b;
import p154v2.C5782a;
import p160w2.C5903h;
import p172y2.C6120c;
import p177z1.C6272r1;

/* renamed from: r2.d */
/* compiled from: MetadataDecoderFactory */
public interface C5437d {

    /* renamed from: a */
    public static final C5437d f27692a = new C5438a();

    /* renamed from: r2.d$a */
    /* compiled from: MetadataDecoderFactory */
    class C5438a implements C5437d {
        C5438a() {
        }

        /* renamed from: a */
        public boolean mo19707a(C6272r1 r1Var) {
            String str = r1Var.f30243t;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        /* renamed from: b */
        public C5436c mo19708b(C6272r1 r1Var) {
            String str = r1Var.f30243t;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new C5478b();
                    case 1:
                        return new C5782a();
                    case 2:
                        return new C5903h();
                    case 3:
                        return new C5509b();
                    case 4:
                        return new C6120c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    /* renamed from: a */
    boolean mo19707a(C6272r1 r1Var);

    /* renamed from: b */
    C5436c mo19708b(C6272r1 r1Var);
}
