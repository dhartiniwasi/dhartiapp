package p264io.flutter.plugin.editing;

import android.os.Bundle;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import p186ac.C6556k;
import p195bc.C6736a;
import p417zb.C13539n;

/* renamed from: io.flutter.plugin.editing.d */
/* compiled from: SpellCheckPlugin */
public class C10708d implements C13539n.C13541b, SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a */
    private final C13539n f41966a;

    /* renamed from: b */
    private final TextServicesManager f41967b;

    /* renamed from: c */
    private SpellCheckerSession f41968c;

    /* renamed from: d */
    C6556k.C6561d f41969d;

    public C10708d(TextServicesManager textServicesManager, C13539n nVar) {
        this.f41967b = textServicesManager;
        this.f41966a = nVar;
        nVar.mo38654b(this);
    }

    /* renamed from: a */
    public void mo34194a(String str, String str2, C6556k.C6561d dVar) {
        if (this.f41969d != null) {
            dVar.error("error", "Previous spell check request still pending.", (Object) null);
            return;
        }
        this.f41969d = dVar;
        mo34196c(str, str2);
    }

    /* renamed from: b */
    public void mo34195b() {
        this.f41966a.mo38654b((C13539n.C13541b) null);
        SpellCheckerSession spellCheckerSession = this.f41968c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    /* renamed from: c */
    public void mo34196c(String str, String str2) {
        Locale b = C6736a.m38634b(str);
        if (this.f41968c == null) {
            this.f41968c = this.f41967b.newSpellCheckerSession((Bundle) null, b, this, true);
        }
        this.f41968c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f41969d.success(new ArrayList());
            this.f41969d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        for (int i = 0; i < sentenceSuggestionsInfo.getSuggestionsCount(); i++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < suggestionsCount; i2++) {
                    arrayList2.add(suggestionsInfoAt.getSuggestionAt(i2));
                }
                hashMap.put("suggestions", arrayList2);
                arrayList.add(hashMap);
            }
        }
        this.f41969d.success(arrayList);
        this.f41969d = null;
    }

    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
