package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ob */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7109ob {
    /* renamed from: a */
    static String m40537a(C6977g8 g8Var) {
        StringBuilder sb = new StringBuilder(g8Var.mo23326f());
        for (int i = 0; i < g8Var.mo23326f(); i++) {
            byte b = g8Var.mo23323b(i);
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
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
                        if (b >= 32 && b <= 126) {
                            sb.append((char) b);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
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
}
