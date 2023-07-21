package com.app.ebarter;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.app.ebarter.databinding.ItemHomeBindingImpl;
import com.app.ebarter.databinding.ItemProfileBindingImpl;
import com.app.ebarter.databinding.ItemRequestBindingImpl;
import com.app.ebarter.databinding.ItemReviewBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ITEMHOME = 1;

  private static final int LAYOUT_ITEMPROFILE = 2;

  private static final int LAYOUT_ITEMREQUEST = 3;

  private static final int LAYOUT_ITEMREVIEW = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.ebarter.R.layout.item_home, LAYOUT_ITEMHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.ebarter.R.layout.item_profile, LAYOUT_ITEMPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.ebarter.R.layout.item_request, LAYOUT_ITEMREQUEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.ebarter.R.layout.item_review, LAYOUT_ITEMREVIEW);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ITEMHOME: {
          if ("layout/item_home_0".equals(tag)) {
            return new ItemHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPROFILE: {
          if ("layout/item_profile_0".equals(tag)) {
            return new ItemProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMREQUEST: {
          if ("layout/item_request_0".equals(tag)) {
            return new ItemRequestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_request is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMREVIEW: {
          if ("layout/item_review_0".equals(tag)) {
            return new ItemReviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_review is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "model");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/item_home_0", com.app.ebarter.R.layout.item_home);
      sKeys.put("layout/item_profile_0", com.app.ebarter.R.layout.item_profile);
      sKeys.put("layout/item_request_0", com.app.ebarter.R.layout.item_request);
      sKeys.put("layout/item_review_0", com.app.ebarter.R.layout.item_review);
    }
  }
}
