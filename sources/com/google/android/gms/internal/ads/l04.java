package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class l04 {
    /* renamed from: a */
    static String m15765a(jw3 jw3) {
        StringBuilder sb = new StringBuilder(jw3.mo9361q());
        for (int i = 0; i < jw3.mo9361q(); i++) {
            byte k = jw3.mo9359k(i);
            if (k == 34) {
                sb.append("\\\"");
            } else if (k == 39) {
                sb.append("\\'");
            } else if (k != 92) {
                switch (k) {
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
                        if (k >= 32 && k <= 126) {
                            sb.append((char) k);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((k >>> 6) & 3) + 48));
                            sb.append((char) (((k >>> 3) & 7) + 48));
                            sb.append((char) ((k & 7) + 48));
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
