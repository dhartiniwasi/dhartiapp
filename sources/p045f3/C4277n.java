package p045f3;

import java.util.Locale;

/* renamed from: f3.n */
/* compiled from: UrlTemplate */
public final class C4277n {

    /* renamed from: a */
    private final String[] f23733a;

    /* renamed from: b */
    private final int[] f23734b;

    /* renamed from: c */
    private final String[] f23735c;

    /* renamed from: d */
    private final int f23736d;

    private C4277n(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.f23733a = strArr;
        this.f23734b = iArr;
        this.f23735c = strArr2;
        this.f23736d = i;
    }

    /* renamed from: b */
    public static C4277n m28808b(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new C4277n(strArr, iArr, strArr2, m28809c(str, strArr, iArr, strArr2));
    }

    /* renamed from: c */
    private static int m28809c(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String str2;
        strArr[0] = "";
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int indexOf = str.indexOf("$", i);
            char c = 65535;
            if (indexOf == -1) {
                strArr[i2] = strArr[i2] + str.substring(i);
                i = str.length();
            } else if (indexOf != i) {
                strArr[i2] = strArr[i2] + str.substring(i, indexOf);
                i = indexOf;
            } else if (str.startsWith("$$", i)) {
                strArr[i2] = strArr[i2] + "$";
                i += 2;
            } else {
                int i3 = i + 1;
                int indexOf2 = str.indexOf("$", i3);
                String substring = str.substring(i3, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i2] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = str2 + "d";
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.hashCode();
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (substring.equals("Number")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 2606829:
                            if (substring.equals("Time")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 38199441:
                            if (substring.equals("Bandwidth")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            iArr[i2] = 2;
                            break;
                        case 1:
                            iArr[i2] = 4;
                            break;
                        case 2:
                            iArr[i2] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    strArr2[i2] = str2;
                }
                i2++;
                strArr[i2] = "";
                i = indexOf2 + 1;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public String mo17706a(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.f23736d;
            if (i2 < i3) {
                sb.append(this.f23733a[i2]);
                int[] iArr = this.f23734b;
                if (iArr[i2] == 1) {
                    sb.append(str);
                } else if (iArr[i2] == 2) {
                    sb.append(String.format(Locale.US, this.f23735c[i2], new Object[]{Long.valueOf(j)}));
                } else if (iArr[i2] == 3) {
                    sb.append(String.format(Locale.US, this.f23735c[i2], new Object[]{Integer.valueOf(i)}));
                } else if (iArr[i2] == 4) {
                    sb.append(String.format(Locale.US, this.f23735c[i2], new Object[]{Long.valueOf(j2)}));
                }
                i2++;
            } else {
                sb.append(this.f23733a[i3]);
                return sb.toString();
            }
        }
    }
}
