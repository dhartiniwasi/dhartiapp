package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0371i;
import androidx.appcompat.view.menu.C0373j;
import androidx.appcompat.widget.C0452a1;
import androidx.appcompat.widget.C0500i0;
import androidx.core.view.C0882b;
import androidx.core.view.C0937l;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p048g.C4297j;
import p145u.C5616a;

/* renamed from: androidx.appcompat.view.g */
/* compiled from: SupportMenuInflater */
public class C0344g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f949e;

    /* renamed from: f */
    static final Class<?>[] f950f;

    /* renamed from: a */
    final Object[] f951a;

    /* renamed from: b */
    final Object[] f952b;

    /* renamed from: c */
    Context f953c;

    /* renamed from: d */
    private Object f954d;

    /* renamed from: androidx.appcompat.view.g$a */
    /* compiled from: SupportMenuInflater */
    private static class C0345a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f955c = {MenuItem.class};

        /* renamed from: a */
        private Object f956a;

        /* renamed from: b */
        private Method f957b;

        public C0345a(Object obj, String str) {
            this.f956a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f957b = cls.getMethod(str, f955c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f957b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f957b.invoke(this.f956a, new Object[]{menuItem})).booleanValue();
                }
                this.f957b.invoke(this.f956a, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.g$b */
    /* compiled from: SupportMenuInflater */
    private class C0346b {

        /* renamed from: A */
        C0882b f958A;

        /* renamed from: B */
        private CharSequence f959B;

        /* renamed from: C */
        private CharSequence f960C;

        /* renamed from: D */
        private ColorStateList f961D = null;

        /* renamed from: E */
        private PorterDuff.Mode f962E = null;

        /* renamed from: a */
        private Menu f964a;

        /* renamed from: b */
        private int f965b;

        /* renamed from: c */
        private int f966c;

        /* renamed from: d */
        private int f967d;

        /* renamed from: e */
        private int f968e;

        /* renamed from: f */
        private boolean f969f;

        /* renamed from: g */
        private boolean f970g;

        /* renamed from: h */
        private boolean f971h;

        /* renamed from: i */
        private int f972i;

        /* renamed from: j */
        private int f973j;

        /* renamed from: k */
        private CharSequence f974k;

        /* renamed from: l */
        private CharSequence f975l;

        /* renamed from: m */
        private int f976m;

        /* renamed from: n */
        private char f977n;

        /* renamed from: o */
        private int f978o;

        /* renamed from: p */
        private char f979p;

        /* renamed from: q */
        private int f980q;

        /* renamed from: r */
        private int f981r;

        /* renamed from: s */
        private boolean f982s;

        /* renamed from: t */
        private boolean f983t;

        /* renamed from: u */
        private boolean f984u;

        /* renamed from: v */
        private int f985v;

        /* renamed from: w */
        private int f986w;

        /* renamed from: x */
        private String f987x;

        /* renamed from: y */
        private String f988y;

        /* renamed from: z */
        private String f989z;

        public C0346b(Menu menu) {
            this.f964a = menu;
            mo1149h();
        }

        /* renamed from: c */
        private char m1681c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m1682e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0344g.this.f953c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: i */
        private void m1683i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f982s).setVisible(this.f983t).setEnabled(this.f984u).setCheckable(this.f981r >= 1).setTitleCondensed(this.f975l).setIcon(this.f976m);
            int i = this.f985v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f989z != null) {
                if (!C0344g.this.f953c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C0345a(C0344g.this.mo1141b(), this.f989z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f981r >= 2) {
                if (menuItem instanceof C0371i) {
                    ((C0371i) menuItem).mo1463t(true);
                } else if (menuItem instanceof C0373j) {
                    ((C0373j) menuItem).mo1493h(true);
                }
            }
            String str = this.f987x;
            if (str != null) {
                menuItem.setActionView((View) m1682e(str, C0344g.f949e, C0344g.this.f951a));
                z = true;
            }
            int i2 = this.f986w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C0882b bVar = this.f958A;
            if (bVar != null) {
                C0937l.m4251a(menuItem, bVar);
            }
            C0937l.m4253c(menuItem, this.f959B);
            C0937l.m4257g(menuItem, this.f960C);
            C0937l.m4252b(menuItem, this.f977n, this.f978o);
            C0937l.m4256f(menuItem, this.f979p, this.f980q);
            PorterDuff.Mode mode = this.f962E;
            if (mode != null) {
                C0937l.m4255e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f961D;
            if (colorStateList != null) {
                C0937l.m4254d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void mo1144a() {
            this.f971h = true;
            m1683i(this.f964a.add(this.f965b, this.f972i, this.f973j, this.f974k));
        }

        /* renamed from: b */
        public SubMenu mo1145b() {
            this.f971h = true;
            SubMenu addSubMenu = this.f964a.addSubMenu(this.f965b, this.f972i, this.f973j, this.f974k);
            m1683i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean mo1146d() {
            return this.f971h;
        }

        /* renamed from: f */
        public void mo1147f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0344g.this.f953c.obtainStyledAttributes(attributeSet, C4297j.f24117o1);
            this.f965b = obtainStyledAttributes.getResourceId(C4297j.f24127q1, 0);
            this.f966c = obtainStyledAttributes.getInt(C4297j.f24137s1, 0);
            this.f967d = obtainStyledAttributes.getInt(C4297j.f24142t1, 0);
            this.f968e = obtainStyledAttributes.getInt(C4297j.f24147u1, 0);
            this.f969f = obtainStyledAttributes.getBoolean(C4297j.f24132r1, true);
            this.f970g = obtainStyledAttributes.getBoolean(C4297j.f24122p1, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void mo1148g(AttributeSet attributeSet) {
            C0452a1 u = C0452a1.m2209u(C0344g.this.f953c, attributeSet, C4297j.f24152v1);
            this.f972i = u.mo2055n(C4297j.f24167y1, 0);
            this.f973j = (u.mo2052k(C4297j.f23942B1, this.f966c) & -65536) | (u.mo2052k(C4297j.f23947C1, this.f967d) & 65535);
            this.f974k = u.mo2057p(C4297j.f23952D1);
            this.f975l = u.mo2057p(C4297j.f23957E1);
            this.f976m = u.mo2055n(C4297j.f24157w1, 0);
            this.f977n = m1681c(u.mo2056o(C4297j.f23962F1));
            this.f978o = u.mo2052k(C4297j.f23991M1, 4096);
            this.f979p = m1681c(u.mo2056o(C4297j.f23967G1));
            this.f980q = u.mo2052k(C4297j.f24007Q1, 4096);
            int i = C4297j.f23971H1;
            if (u.mo2060s(i)) {
                this.f981r = u.mo2042a(i, false) ? 1 : 0;
            } else {
                this.f981r = this.f968e;
            }
            this.f982s = u.mo2042a(C4297j.f24172z1, false);
            this.f983t = u.mo2042a(C4297j.f23937A1, this.f969f);
            this.f984u = u.mo2042a(C4297j.f24162x1, this.f970g);
            this.f985v = u.mo2052k(C4297j.f24011R1, -1);
            this.f989z = u.mo2056o(C4297j.f23975I1);
            this.f986w = u.mo2055n(C4297j.f23979J1, 0);
            this.f987x = u.mo2056o(C4297j.f23987L1);
            String o = u.mo2056o(C4297j.f23983K1);
            this.f988y = o;
            boolean z = o != null;
            if (z && this.f986w == 0 && this.f987x == null) {
                this.f958A = (C0882b) m1682e(o, C0344g.f950f, C0344g.this.f952b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f958A = null;
            }
            this.f959B = u.mo2057p(C4297j.f23995N1);
            this.f960C = u.mo2057p(C4297j.f24015S1);
            int i2 = C4297j.f24003P1;
            if (u.mo2060s(i2)) {
                this.f962E = C0500i0.m2467d(u.mo2052k(i2, -1), this.f962E);
            } else {
                this.f962E = null;
            }
            int i3 = C4297j.f23999O1;
            if (u.mo2060s(i3)) {
                this.f961D = u.mo2044c(i3);
            } else {
                this.f961D = null;
            }
            u.mo2061w();
            this.f971h = false;
        }

        /* renamed from: h */
        public void mo1149h() {
            this.f965b = 0;
            this.f966c = 0;
            this.f967d = 0;
            this.f968e = 0;
            this.f969f = true;
            this.f970g = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f949e = r0
            f950f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.C0344g.<clinit>():void");
    }

    public C0344g(Context context) {
        super(context);
        this.f953c = context;
        Object[] objArr = {context};
        this.f951a = objArr;
        this.f952b = objArr;
    }

    /* renamed from: a */
    private Object m1678a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m1678a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: c */
    private void m1679c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C0346b bVar = new C0346b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.mo1149h();
                        } else if (name2.equals("item")) {
                            if (!bVar.mo1146d()) {
                                C0882b bVar2 = bVar.f958A;
                                if (bVar2 == null || !bVar2.mo1527a()) {
                                    bVar.mo1144a();
                                } else {
                                    bVar.mo1145b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.mo1147f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.mo1148g(attributeSet);
                    } else if (name3.equals("menu")) {
                        m1679c(xmlPullParser, attributeSet, bVar.mo1145b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object mo1141b() {
        if (this.f954d == null) {
            this.f954d = m1678a(this.f953c);
        }
        return this.f954d;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof C5616a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f953c.getResources().getLayout(i);
            m1679c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
