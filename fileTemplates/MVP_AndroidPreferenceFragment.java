#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.core.AbstractPreferenceFragment;

public class ${NAME} extends AbstractPreferenceFragment<${NAME}Presenter> implements ${NAME}View {
    
  @Nullable @Override public View onCreateView(LayoutInfalter factory, ViewGroup parent, Bundle savedState) {
    View view = factory.inflate(${LAYOUT_RES}, parent, false);
    // TODO read view references
    return view;
  }  
  
  @Override public void onActivityCreated(Bundle restoreState) {
    super.onActivityCreated(restoreState);
    
    presenter.restoreState(restoreState != null ? restoreState: getArguments());
    presenter.onCreate();
  }
    
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }    
}