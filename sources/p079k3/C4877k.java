package p079k3;

import p086l3.C4917a;
import p086l3.C4920c;
import p093m3.C5032a;
import p100n3.C5120a;
import p114p3.C5270a;
import p121q3.C5397a;
import p128r3.C5445c;
import p135s3.C5479a;
import p142t3.C5511a;
import p142t3.C5522h;
import p177z1.C6272r1;

/* renamed from: k3.k */
/* compiled from: SubtitleDecoderFactory */
public interface C4877k {

    /* renamed from: a */
    public static final C4877k f25805a = new C4878a();

    /* renamed from: k3.k$a */
    /* compiled from: SubtitleDecoderFactory */
    class C4878a implements C4877k {
        C4878a() {
        }

        /* renamed from: a */
        public boolean mo18657a(C6272r1 r1Var) {
            String str = r1Var.f30243t;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        /* renamed from: b */
        public C4875i mo18658b(C6272r1 r1Var) {
            String str = r1Var.f30243t;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1201784583:
                        if (str.equals("text/x-exoplayer-cues")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c = 8;
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c = 10;
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c = 11;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new C5032a(r1Var.f30245v);
                    case 1:
                        return new C5120a();
                    case 2:
                        return new C5511a();
                    case 3:
                        return new C5522h();
                    case 4:
                        return new C5479a(r1Var.f30245v);
                    case 5:
                        return new C5270a(r1Var.f30245v);
                    case 6:
                    case 8:
                        return new C4917a(str, r1Var.f30229L, 16000);
                    case 7:
                        return new C4869f();
                    case 9:
                        return new C4920c(r1Var.f30229L, r1Var.f30245v);
                    case 10:
                        return new C5397a();
                    case 11:
                        return new C5445c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    /* renamed from: a */
    boolean mo18657a(C6272r1 r1Var);

    /* renamed from: b */
    C4875i mo18658b(C6272r1 r1Var);
}
