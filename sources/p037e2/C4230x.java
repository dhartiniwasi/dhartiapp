package p037e2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p127r2.C5432a;
import p160w2.C5899e;
import p160w2.C5907j;
import p161w3.C5953m0;

/* renamed from: e2.x */
/* compiled from: GaplessInfoHolder */
public final class C4230x {

    /* renamed from: c */
    private static final Pattern f23584c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f23585a = -1;

    /* renamed from: b */
    public int f23586b = -1;

    /* renamed from: b */
    private boolean m28536b(String str) {
        Matcher matcher = f23584c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) C5953m0.m35138j(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) C5953m0.m35138j(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f23585a = parseInt;
            this.f23586b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo17592a() {
        return (this.f23585a == -1 || this.f23586b == -1) ? false : true;
    }

    /* renamed from: c */
    public boolean mo17593c(C5432a aVar) {
        for (int i = 0; i < aVar.mo19696d(); i++) {
            C5432a.C5434b c = aVar.mo19695c(i);
            if (c instanceof C5899e) {
                C5899e eVar = (C5899e) c;
                if ("iTunSMPB".equals(eVar.f29021c) && m28536b(eVar.f29022d)) {
                    return true;
                }
            } else if (c instanceof C5907j) {
                C5907j jVar = (C5907j) c;
                if ("com.apple.iTunes".equals(jVar.f29033b) && "iTunSMPB".equals(jVar.f29034c) && m28536b(jVar.f29035d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo17594d(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f23585a = i2;
        this.f23586b = i3;
        return true;
    }
}
