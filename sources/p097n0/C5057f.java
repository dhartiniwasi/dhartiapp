package p097n0;

import android.database.Cursor;
import android.os.Build;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p111p0.C5249b;

/* renamed from: n0.f */
/* compiled from: TableInfo */
public class C5057f {

    /* renamed from: a */
    public final String f26449a;

    /* renamed from: b */
    public final Map<String, C5058a> f26450b;

    /* renamed from: c */
    public final Set<C5059b> f26451c;

    /* renamed from: d */
    public final Set<C5061d> f26452d;

    /* renamed from: n0.f$a */
    /* compiled from: TableInfo */
    public static class C5058a {

        /* renamed from: a */
        public final String f26453a;

        /* renamed from: b */
        public final String f26454b;

        /* renamed from: c */
        public final int f26455c;

        /* renamed from: d */
        public final boolean f26456d;

        /* renamed from: e */
        public final int f26457e;

        /* renamed from: f */
        public final String f26458f;

        /* renamed from: g */
        private final int f26459g;

        public C5058a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.f26453a = str;
            this.f26454b = str2;
            this.f26456d = z;
            this.f26457e = i;
            this.f26455c = m31785a(str2);
            this.f26458f = str3;
            this.f26459g = i2;
        }

        /* renamed from: a */
        private static int m31785a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains(AdPreferences.TYPE_TEXT)) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        /* renamed from: b */
        public boolean mo18974b() {
            return this.f26457e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C5058a aVar = (C5058a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f26457e != aVar.f26457e) {
                    return false;
                }
            } else if (mo18974b() != aVar.mo18974b()) {
                return false;
            }
            if (!this.f26453a.equals(aVar.f26453a) || this.f26456d != aVar.f26456d) {
                return false;
            }
            if (this.f26459g == 1 && aVar.f26459g == 2 && (str3 = this.f26458f) != null && !str3.equals(aVar.f26458f)) {
                return false;
            }
            if (this.f26459g == 2 && aVar.f26459g == 1 && (str2 = aVar.f26458f) != null && !str2.equals(this.f26458f)) {
                return false;
            }
            int i = this.f26459g;
            if ((i == 0 || i != aVar.f26459g || ((str = this.f26458f) == null ? aVar.f26458f == null : str.equals(aVar.f26458f))) && this.f26455c == aVar.f26455c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f26453a.hashCode() * 31) + this.f26455c) * 31) + (this.f26456d ? 1231 : 1237)) * 31) + this.f26457e;
        }

        public String toString() {
            return "Column{name='" + this.f26453a + '\'' + ", type='" + this.f26454b + '\'' + ", affinity='" + this.f26455c + '\'' + ", notNull=" + this.f26456d + ", primaryKeyPosition=" + this.f26457e + ", defaultValue='" + this.f26458f + '\'' + '}';
        }
    }

    /* renamed from: n0.f$b */
    /* compiled from: TableInfo */
    public static class C5059b {

        /* renamed from: a */
        public final String f26460a;

        /* renamed from: b */
        public final String f26461b;

        /* renamed from: c */
        public final String f26462c;

        /* renamed from: d */
        public final List<String> f26463d;

        /* renamed from: e */
        public final List<String> f26464e;

        public C5059b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f26460a = str;
            this.f26461b = str2;
            this.f26462c = str3;
            this.f26463d = Collections.unmodifiableList(list);
            this.f26464e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C5059b bVar = (C5059b) obj;
            if (this.f26460a.equals(bVar.f26460a) && this.f26461b.equals(bVar.f26461b) && this.f26462c.equals(bVar.f26462c) && this.f26463d.equals(bVar.f26463d)) {
                return this.f26464e.equals(bVar.f26464e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f26460a.hashCode() * 31) + this.f26461b.hashCode()) * 31) + this.f26462c.hashCode()) * 31) + this.f26463d.hashCode()) * 31) + this.f26464e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f26460a + '\'' + ", onDelete='" + this.f26461b + '\'' + ", onUpdate='" + this.f26462c + '\'' + ", columnNames=" + this.f26463d + ", referenceColumnNames=" + this.f26464e + '}';
        }
    }

    /* renamed from: n0.f$c */
    /* compiled from: TableInfo */
    static class C5060c implements Comparable<C5060c> {

        /* renamed from: a */
        final int f26465a;

        /* renamed from: b */
        final int f26466b;

        /* renamed from: c */
        final String f26467c;

        /* renamed from: d */
        final String f26468d;

        C5060c(int i, int i2, String str, String str2) {
            this.f26465a = i;
            this.f26466b = i2;
            this.f26467c = str;
            this.f26468d = str2;
        }

        /* renamed from: a */
        public int compareTo(C5060c cVar) {
            int i = this.f26465a - cVar.f26465a;
            return i == 0 ? this.f26466b - cVar.f26466b : i;
        }
    }

    /* renamed from: n0.f$d */
    /* compiled from: TableInfo */
    public static class C5061d {

        /* renamed from: a */
        public final String f26469a;

        /* renamed from: b */
        public final boolean f26470b;

        /* renamed from: c */
        public final List<String> f26471c;

        public C5061d(String str, boolean z, List<String> list) {
            this.f26469a = str;
            this.f26470b = z;
            this.f26471c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C5061d dVar = (C5061d) obj;
            if (this.f26470b != dVar.f26470b || !this.f26471c.equals(dVar.f26471c)) {
                return false;
            }
            if (this.f26469a.startsWith("index_")) {
                return dVar.f26469a.startsWith("index_");
            }
            return this.f26469a.equals(dVar.f26469a);
        }

        public int hashCode() {
            int i;
            if (this.f26469a.startsWith("index_")) {
                i = -1184239155;
            } else {
                i = this.f26469a.hashCode();
            }
            return (((i * 31) + (this.f26470b ? 1 : 0)) * 31) + this.f26471c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f26469a + '\'' + ", unique=" + this.f26470b + ", columns=" + this.f26471c + '}';
        }
    }

    public C5057f(String str, Map<String, C5058a> map, Set<C5059b> set, Set<C5061d> set2) {
        Set<C5061d> set3;
        this.f26449a = str;
        this.f26450b = Collections.unmodifiableMap(map);
        this.f26451c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.f26452d = set3;
    }

    /* renamed from: a */
    public static C5057f m31779a(C5249b bVar, String str) {
        return new C5057f(str, m31780b(bVar, str), m31782d(bVar, str), m31784f(bVar, str));
    }

    /* renamed from: b */
    private static Map<String, C5058a> m31780b(C5249b bVar, String str) {
        Cursor z0 = bVar.mo19241z0("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (z0.getColumnCount() > 0) {
                int columnIndex = z0.getColumnIndex(MediationMetaData.KEY_NAME);
                int columnIndex2 = z0.getColumnIndex("type");
                int columnIndex3 = z0.getColumnIndex("notnull");
                int columnIndex4 = z0.getColumnIndex("pk");
                int columnIndex5 = z0.getColumnIndex("dflt_value");
                while (z0.moveToNext()) {
                    String string = z0.getString(columnIndex);
                    hashMap.put(string, new C5058a(string, z0.getString(columnIndex2), z0.getInt(columnIndex3) != 0, z0.getInt(columnIndex4), z0.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            z0.close();
        }
    }

    /* renamed from: c */
    private static List<C5060c> m31781c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C5060c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: d */
    private static Set<C5059b> m31782d(C5249b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor z0 = bVar.mo19241z0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = z0.getColumnIndex("id");
            int columnIndex2 = z0.getColumnIndex("seq");
            int columnIndex3 = z0.getColumnIndex("table");
            int columnIndex4 = z0.getColumnIndex("on_delete");
            int columnIndex5 = z0.getColumnIndex("on_update");
            List<C5060c> c = m31781c(z0);
            int count = z0.getCount();
            for (int i = 0; i < count; i++) {
                z0.moveToPosition(i);
                if (z0.getInt(columnIndex2) == 0) {
                    int i2 = z0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C5060c next : c) {
                        if (next.f26465a == i2) {
                            arrayList.add(next.f26467c);
                            arrayList2.add(next.f26468d);
                        }
                    }
                    hashSet.add(new C5059b(z0.getString(columnIndex3), z0.getString(columnIndex4), z0.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            z0.close();
        }
    }

    /* renamed from: e */
    private static C5061d m31783e(C5249b bVar, String str, boolean z) {
        Cursor z0 = bVar.mo19241z0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = z0.getColumnIndex("seqno");
            int columnIndex2 = z0.getColumnIndex("cid");
            int columnIndex3 = z0.getColumnIndex(MediationMetaData.KEY_NAME);
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (z0.moveToNext()) {
                        if (z0.getInt(columnIndex2) >= 0) {
                            int i = z0.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), z0.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    C5061d dVar = new C5061d(str, z, arrayList);
                    z0.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            z0.close();
        }
    }

    /* renamed from: f */
    private static Set<C5061d> m31784f(C5249b bVar, String str) {
        Cursor z0 = bVar.mo19241z0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = z0.getColumnIndex(MediationMetaData.KEY_NAME);
            int columnIndex2 = z0.getColumnIndex("origin");
            int columnIndex3 = z0.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (z0.moveToNext()) {
                        if ("c".equals(z0.getString(columnIndex2))) {
                            String string = z0.getString(columnIndex);
                            boolean z = true;
                            if (z0.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            C5061d e = m31783e(bVar, string, z);
                            if (e == null) {
                                z0.close();
                                return null;
                            }
                            hashSet.add(e);
                        }
                    }
                    z0.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            z0.close();
        }
    }

    public boolean equals(Object obj) {
        Set<C5061d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5057f fVar = (C5057f) obj;
        String str = this.f26449a;
        if (str == null ? fVar.f26449a != null : !str.equals(fVar.f26449a)) {
            return false;
        }
        Map<String, C5058a> map = this.f26450b;
        if (map == null ? fVar.f26450b != null : !map.equals(fVar.f26450b)) {
            return false;
        }
        Set<C5059b> set2 = this.f26451c;
        if (set2 == null ? fVar.f26451c != null : !set2.equals(fVar.f26451c)) {
            return false;
        }
        Set<C5061d> set3 = this.f26452d;
        if (set3 == null || (set = fVar.f26452d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f26449a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, C5058a> map = this.f26450b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C5059b> set = this.f26451c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "TableInfo{name='" + this.f26449a + '\'' + ", columns=" + this.f26450b + ", foreignKeys=" + this.f26451c + ", indices=" + this.f26452d + '}';
    }
}
