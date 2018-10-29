#parse("Kotlin File Header.kt")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import org.fs.architecture.core.AbstractFragmentStatePagerAdapter

class ${NAME}(dataSet: ObservableList<${DATA_TYPE}>, fragmentManager: FragmentManager): AbstractFragmentStatePagerAdapter<${DATA_TYPE}>(dataSet, fragmentManager) {
  
  override fun onBindFragment(position: Int, item: ${DATA_TYPE}): Fragment {
    // TODO implement fragment pager adapter here
  }
}