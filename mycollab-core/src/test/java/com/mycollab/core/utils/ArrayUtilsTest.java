package com.mycollab.core.utils;

import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilsTest {

  /* testedClasses: ArrayUtils */

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 31 branch to line 31
   */

  @Test
  public void com_mycollab_core_utils_ArrayUtils_isNotEmpty_000_5af25f4d970e37d6() throws Throwable {

    boolean retval;
    {
      /* Arrange */
      Object [] dynamic_2_array = new Object []{ null };
      Object [] param_1 = dynamic_2_array;
      Object [] array = param_1;

      /* Act */
      retval = com.mycollab.core.utils.ArrayUtils.isNotEmpty(array);
    }
    {
      /* Assert result */
      Assert.assertEquals(true, retval);
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 31 branch to line 31
   */

  @Test
  public void com_mycollab_core_utils_ArrayUtils_isNotEmpty_000_638c0426c6a78a4d() throws Throwable {

    boolean retval;
    {
      /* Arrange */
      Object [] array = null;

      /* Act */
      retval = com.mycollab.core.utils.ArrayUtils.isNotEmpty(array);
    }
    {
      /* Assert result */
      Assert.assertEquals(false, retval);
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 31 branch to line 31
   */

  @Test
  public void com_mycollab_core_utils_ArrayUtils_isNotEmpty_001_19297e2bd59ad34f() throws Throwable {

    boolean retval;
    {
      /* Arrange */
      Object [] dynamic_2_array = new Object []{  };
      Object [] param_1 = dynamic_2_array;
      Object [] array = param_1;

      /* Act */
      retval = com.mycollab.core.utils.ArrayUtils.isNotEmpty(array);
    }
    {
      /* Assert result */
      Assert.assertEquals(false, retval);
    }
  }
}