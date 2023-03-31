package p238g8;

import com.google.protobuf.C8153i;
import java.util.List;
import p211d8.C9888l;
import p211d8.C9899s;
import p247h8.C10432b;
import p343rc.C12335j1;

/* renamed from: g8.t0 */
/* compiled from: WatchChange */
public abstract class C10275t0 {

    /* renamed from: g8.t0$b */
    /* compiled from: WatchChange */
    public static final class C10277b extends C10275t0 {

        /* renamed from: a */
        private final List<Integer> f40833a;

        /* renamed from: b */
        private final List<Integer> f40834b;

        /* renamed from: c */
        private final C9888l f40835c;

        /* renamed from: d */
        private final C9899s f40836d;

        public C10277b(List<Integer> list, List<Integer> list2, C9888l lVar, C9899s sVar) {
            super();
            this.f40833a = list;
            this.f40834b = list2;
            this.f40835c = lVar;
            this.f40836d = sVar;
        }

        /* renamed from: a */
        public C9888l mo33050a() {
            return this.f40835c;
        }

        /* renamed from: b */
        public C9899s mo33051b() {
            return this.f40836d;
        }

        /* renamed from: c */
        public List<Integer> mo33052c() {
            return this.f40834b;
        }

        /* renamed from: d */
        public List<Integer> mo33053d() {
            return this.f40833a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C10277b.class != obj.getClass()) {
                return false;
            }
            C10277b bVar = (C10277b) obj;
            if (!this.f40833a.equals(bVar.f40833a) || !this.f40834b.equals(bVar.f40834b) || !this.f40835c.equals(bVar.f40835c)) {
                return false;
            }
            C9899s sVar = this.f40836d;
            C9899s sVar2 = bVar.f40836d;
            if (sVar != null) {
                return sVar.equals(sVar2);
            }
            if (sVar2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((((this.f40833a.hashCode() * 31) + this.f40834b.hashCode()) * 31) + this.f40835c.hashCode()) * 31;
            C9899s sVar = this.f40836d;
            return hashCode + (sVar != null ? sVar.hashCode() : 0);
        }

        public String toString() {
            return "DocumentChange{updatedTargetIds=" + this.f40833a + ", removedTargetIds=" + this.f40834b + ", key=" + this.f40835c + ", newDocument=" + this.f40836d + '}';
        }
    }

    /* renamed from: g8.t0$c */
    /* compiled from: WatchChange */
    public static final class C10278c extends C10275t0 {

        /* renamed from: a */
        private final int f40837a;

        /* renamed from: b */
        private final C10260o f40838b;

        public C10278c(int i, C10260o oVar) {
            super();
            this.f40837a = i;
            this.f40838b = oVar;
        }

        /* renamed from: a */
        public C10260o mo33057a() {
            return this.f40838b;
        }

        /* renamed from: b */
        public int mo33058b() {
            return this.f40837a;
        }

        public String toString() {
            return "ExistenceFilterWatchChange{targetId=" + this.f40837a + ", existenceFilter=" + this.f40838b + '}';
        }
    }

    /* renamed from: g8.t0$d */
    /* compiled from: WatchChange */
    public static final class C10279d extends C10275t0 {

        /* renamed from: a */
        private final C10280e f40839a;

        /* renamed from: b */
        private final List<Integer> f40840b;

        /* renamed from: c */
        private final C8153i f40841c;

        /* renamed from: d */
        private final C12335j1 f40842d;

        public C10279d(C10280e eVar, List<Integer> list, C8153i iVar, C12335j1 j1Var) {
            super();
            C10432b.m52648d(j1Var == null || eVar == C10280e.Removed, "Got cause for a target change that was not a removal", new Object[0]);
            this.f40839a = eVar;
            this.f40840b = list;
            this.f40841c = iVar;
            if (j1Var == null || j1Var.mo37028o()) {
                this.f40842d = null;
            } else {
                this.f40842d = j1Var;
            }
        }

        /* renamed from: a */
        public C12335j1 mo33060a() {
            return this.f40842d;
        }

        /* renamed from: b */
        public C10280e mo33061b() {
            return this.f40839a;
        }

        /* renamed from: c */
        public C8153i mo33062c() {
            return this.f40841c;
        }

        /* renamed from: d */
        public List<Integer> mo33063d() {
            return this.f40840b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C10279d.class != obj.getClass()) {
                return false;
            }
            C10279d dVar = (C10279d) obj;
            if (this.f40839a != dVar.f40839a || !this.f40840b.equals(dVar.f40840b) || !this.f40841c.equals(dVar.f40841c)) {
                return false;
            }
            C12335j1 j1Var = this.f40842d;
            if (j1Var != null) {
                if (dVar.f40842d == null || !j1Var.mo37026m().equals(dVar.f40842d.mo37026m())) {
                    return false;
                }
                return true;
            } else if (dVar.f40842d == null) {
                return true;
            } else {
                return false;
            }
        }

        public int hashCode() {
            int hashCode = ((((this.f40839a.hashCode() * 31) + this.f40840b.hashCode()) * 31) + this.f40841c.hashCode()) * 31;
            C12335j1 j1Var = this.f40842d;
            return hashCode + (j1Var != null ? j1Var.mo37026m().hashCode() : 0);
        }

        public String toString() {
            return "WatchTargetChange{changeType=" + this.f40839a + ", targetIds=" + this.f40840b + '}';
        }
    }

    /* renamed from: g8.t0$e */
    /* compiled from: WatchChange */
    public enum C10280e {
        NoChange,
        Added,
        Removed,
        Current,
        Reset
    }

    private C10275t0() {
    }
}
