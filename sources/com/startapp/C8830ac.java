package com.startapp;

import android.text.TextUtils;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* renamed from: com.startapp.ac */
/* compiled from: Sta */
public class C8830ac {

    /* renamed from: a */
    public final Node f36429a;

    /* renamed from: b */
    public final boolean f36430b = true;

    public C8830ac(Node node) {
        this.f36429a = node;
    }

    /* renamed from: a */
    public final List<C8830ac> mo29100a(String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) C9203od.m49108a(this.f36429a, str, str2, list)).iterator();
        while (it.hasNext()) {
            arrayList.add(new C8830ac((Node) it.next()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C8830ac mo29101b(String str, String str2, List<String> list) {
        ArrayList arrayList = (ArrayList) C9203od.m49108a(this.f36429a, str, str2, (List<String>) null);
        Node node = arrayList.isEmpty() ? null : (Node) arrayList.get(0);
        if (node != null) {
            return new C8830ac(node);
        }
        return null;
    }

    /* renamed from: c */
    public final List<String> mo29106c(String str) {
        List<C8830ac> a = mo29100a(str, (String) null, (List<String>) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) a).iterator();
        while (it.hasNext()) {
            String d = ((C8830ac) it.next()).mo29107d();
            if (!TextUtils.isEmpty(d)) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String mo29107d() {
        Node node = this.f36429a;
        if (node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        return node.getFirstChild().getNodeValue().trim();
    }

    /* renamed from: e */
    public List<String> mo29109e(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) mo29108d(str)).iterator();
        while (it.hasNext()) {
            String d = ((C8830ac) it.next()).mo29107d();
            if (!TextUtils.isEmpty(d)) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final String mo29110f(String str) {
        C8830ac b = mo29101b(str, (String) null, (List<String>) null);
        if (b == null) {
            return null;
        }
        return b.mo29107d();
    }

    public C8830ac(String str) throws ParserConfigurationException, SAXException, IOException {
        String replaceFirst = str.replaceFirst("<\\?.*\\?>", "");
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setCoalescing(true);
        newInstance.setExpandEntityReferences(false);
        this.f36429a = newInstance.newDocumentBuilder().parse(new InputSource(new StringReader(replaceFirst))).getFirstChild();
    }

    /* renamed from: d */
    public final List<C8830ac> mo29108d(String str) {
        return mo29099a("Tracking", "TrackingEvents", "event", Collections.singletonList(str));
    }

    /* renamed from: a */
    public final List<C8830ac> mo29099a(String str, String str2, String str3, List<String> list) {
        ArrayList arrayList = new ArrayList();
        C8830ac b = mo29101b(str2, (String) null, (List<String>) null);
        if (b == null) {
            return arrayList;
        }
        return b.mo29100a(str, str3, list);
    }

    /* renamed from: b */
    public final Integer mo29102b(String str) {
        try {
            String a = mo29096a(str);
            if (a != null) {
                return Integer.valueOf(Integer.parseInt(a));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final List<String> mo29104b(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) mo29099a(str, str2, (String) null, (List<String>) null)).iterator();
        while (it.hasNext()) {
            String d = ((C8830ac) it.next()).mo29107d();
            if (!TextUtils.isEmpty(d)) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public List<C8830ac> mo29105c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) mo29099a("Creative", "Creatives", (String) null, (List<String>) null)).iterator();
        while (it.hasNext()) {
            C8830ac b = ((C8830ac) it.next()).mo29101b("Linear", (String) null, (List<String>) null);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final String mo29096a(String str) {
        Node namedItem = this.f36429a.getAttributes().getNamedItem(str);
        if (namedItem != null) {
            return namedItem.getNodeValue();
        }
        return null;
    }

    /* renamed from: a */
    public final String mo29097a(String str, String str2) {
        C8830ac b;
        C8830ac b2 = mo29101b(str2, (String) null, (List<String>) null);
        if (b2 == null || (b = b2.mo29101b(str, (String) null, (List<String>) null)) == null) {
            return null;
        }
        return b.mo29107d();
    }

    /* renamed from: b */
    public List<String> mo29103b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) mo29108d("creativeView")).iterator();
        while (it.hasNext()) {
            String d = ((C8830ac) it.next()).mo29107d();
            if (!TextUtils.isEmpty(d)) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<C8830ac> mo29098a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) mo29099a("Creative", "Creatives", (String) null, (List<String>) null)).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((C8830ac) it.next()).mo29099a("Companion", "CompanionAds", (String) null, (List<String>) null));
        }
        return arrayList;
    }
}
