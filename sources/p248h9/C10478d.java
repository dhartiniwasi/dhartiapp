package p248h9;

import java.util.HashMap;
import java.util.Map;
import p212d9.C9914f;

/* renamed from: h9.d */
/* compiled from: CharacterSetECI */
public enum C10478d {
    Cp437((String) new int[]{0, 2}, (int) new String[0]),
    ISO8859_1((String) new int[]{1, 3}, (int) new String[]{"ISO-8859-1"}),
    ISO8859_2((String) 4, (int) new String[]{"ISO-8859-2"}),
    ISO8859_3((String) 5, (int) new String[]{"ISO-8859-3"}),
    ISO8859_4((String) 6, (int) new String[]{"ISO-8859-4"}),
    ISO8859_5((String) 7, (int) new String[]{"ISO-8859-5"}),
    ISO8859_6((String) 8, (int) new String[]{"ISO-8859-6"}),
    ISO8859_7((String) 9, (int) new String[]{"ISO-8859-7"}),
    ISO8859_8((String) 10, (int) new String[]{"ISO-8859-8"}),
    ISO8859_9((String) 11, (int) new String[]{"ISO-8859-9"}),
    ISO8859_10((String) 12, (int) new String[]{"ISO-8859-10"}),
    ISO8859_11((String) 13, (int) new String[]{"ISO-8859-11"}),
    ISO8859_13((String) 15, (int) new String[]{"ISO-8859-13"}),
    ISO8859_14((String) 16, (int) new String[]{"ISO-8859-14"}),
    ISO8859_15((String) 17, (int) new String[]{"ISO-8859-15"}),
    ISO8859_16((String) 18, (int) new String[]{"ISO-8859-16"}),
    SJIS((String) 20, (int) new String[]{"Shift_JIS"}),
    Cp1250((String) 21, (int) new String[]{"windows-1250"}),
    Cp1251((String) 22, (int) new String[]{"windows-1251"}),
    Cp1252((String) 23, (int) new String[]{"windows-1252"}),
    Cp1256((String) 24, (int) new String[]{"windows-1256"}),
    UnicodeBigUnmarked((String) 25, (int) new String[]{"UTF-16BE", "UnicodeBig"}),
    UTF8((String) 26, (int) new String[]{"UTF-8"}),
    ASCII((String) new int[]{27, 170}, (int) new String[]{"US-ASCII"}),
    Big5(28),
    GB18030((String) 29, (int) new String[]{"GB2312", "EUC_CN", "GBK"}),
    EUC_KR((String) 30, (int) new String[]{"EUC-KR"});
    

    /* renamed from: L */
    private static final Map<Integer, C10478d> f41479L = null;

    /* renamed from: M */
    private static final Map<String, C10478d> f41480M = null;

    /* renamed from: a */
    private final int[] f41498a;

    /* renamed from: b */
    private final String[] f41499b;

    static {
        f41479L = new HashMap();
        f41480M = new HashMap();
        for (C10478d dVar : values()) {
            for (int valueOf : dVar.f41498a) {
                f41479L.put(Integer.valueOf(valueOf), dVar);
            }
            f41480M.put(dVar.name(), dVar);
            for (String put : dVar.f41499b) {
                f41480M.put(put, dVar);
            }
        }
    }

    private C10478d(int i) {
        this(r3, r4, new int[]{i}, new String[0]);
    }

    /* renamed from: a */
    public static C10478d m52820a(int i) throws C9914f {
        if (i >= 0 && i < 900) {
            return f41479L.get(Integer.valueOf(i));
        }
        throw C9914f.m50845a();
    }

    private C10478d(int i, String... strArr) {
        this.f41498a = new int[]{i};
        this.f41499b = strArr;
    }

    private C10478d(int[] iArr, String... strArr) {
        this.f41498a = iArr;
        this.f41499b = strArr;
    }
}
