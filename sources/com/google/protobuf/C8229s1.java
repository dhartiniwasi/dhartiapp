package com.google.protobuf;

/* renamed from: com.google.protobuf.s1 */
/* compiled from: TextFormatEscaper */
final class C8229s1 {

    /* renamed from: com.google.protobuf.s1$a */
    /* compiled from: TextFormatEscaper */
    static class C8230a implements C8231b {

        /* renamed from: a */
        final /* synthetic */ C8153i f35080a;

        C8230a(C8153i iVar) {
            this.f35080a = iVar;
        }

        /* renamed from: a */
        public byte mo27288a(int i) {
            return this.f35080a.mo26887i(i);
        }

        public int size() {
            return this.f35080a.size();
        }
    }

    /* renamed from: com.google.protobuf.s1$b */
    /* compiled from: TextFormatEscaper */
    private interface C8231b {
        /* renamed from: a */
        byte mo27288a(int i);

        int size();
    }

    /* renamed from: a */
    static String m45624a(C8153i iVar) {
        return m45625b(new C8230a(iVar));
    }

    /* renamed from: b */
    static String m45625b(C8231b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i = 0; i < bVar.size(); i++) {
            byte a = bVar.mo27288a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a >= 32 && a <= 126) {
                            sb.append((char) a);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    static String m45626c(String str) {
        return m45624a(C8153i.m44779s(str));
    }
}
