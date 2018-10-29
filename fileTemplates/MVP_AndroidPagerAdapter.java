#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import org.fs.core.AbstractPagerAdapter;

@${SCOPE}
public class ${NAME} extends AbstractPagerAdapter<${TYPE_NAME}> {
    
  @Inject public ${NAME}(FragmentManager fragmentManager, ObservableList<${TYPE_NAME}> dataSet) {
    super(fragmentManager, dataSet);
  }
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
  
  @Override protected Fragment bind(int position, ${TYPE_NAME} element) {
    return null;//change this with creating new Fragment logic
  }
}