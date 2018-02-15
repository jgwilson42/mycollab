package com.mycollab.core.utils;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

  /* testedClasses: StringUtils */

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 132 branch to line 138
   */

  @Test
  public void com_mycollab_core_utils_StringUtils_trimHtmlTags_000_2d971a99b2a408d() throws Throwable {

    String retval;
    {
      /* Arrange */
      String value = null;
      int limitedCharacters = 1;

      /* Act */
      retval = com.mycollab.core.utils.StringUtils.trimHtmlTags(value, limitedCharacters);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertEquals("", retval);
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 132 branch to line 138
   */

  @Test
  public void com_mycollab_core_utils_StringUtils_trimHtmlTags_000_7fb0f0a5ac51cc59() throws Throwable {

    String retval;
    {
      /* Arrange */
      String value = null;
      int limitedCharacters = 3;

      /* Act */
      retval = com.mycollab.core.utils.StringUtils.trimHtmlTags(value, limitedCharacters);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertEquals("", retval);
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 66 branch to line 67
   */

  @Test
  public void com_mycollab_core_utils_StringUtils_trim_000_11ae4b4f95d114bd() throws Throwable {

    String retval;
    {
      /* Arrange */
      String input = null;
      int length = 3;
      boolean withEllipsis = false;

      /* Act */
      retval = com.mycollab.core.utils.StringUtils.trim(input, length, withEllipsis);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertEquals("", retval);
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 66 branch to line 70
   * conditional line 70 branch to line 73
   * conditional line 73 branch to line 73
   */

  @Test
  public void com_mycollab_core_utils_StringUtils_trim_001_14c89854cbe9228c() throws Throwable {

    String retval;
    {
      /* Arrange */
      String param_2 = "!!!!!!!!";
      String input = param_2;
      int length = 6;
      boolean withEllipsis = true;

      /* Act */
      retval = com.mycollab.core.utils.StringUtils.trim(input, length, withEllipsis);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertEquals("!!!!!!...", retval);
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 66 branch to line 70
   * conditional line 70 branch to line 73
   * conditional line 73 branch to line 73
   */

  @Test
  public void com_mycollab_core_utils_StringUtils_trim_002_be8d2fae339d0db0() throws Throwable {

    String retval;
    {
      /* Arrange */
      String param_2 = "!!!!!!!!";
      String input = param_2;
      int length = 6;
      boolean withEllipsis = false;

      /* Act */
      retval = com.mycollab.core.utils.StringUtils.trim(input, length, withEllipsis);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertEquals("!!!!!!", retval);
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 66 branch to line 70
   * conditional line 70 branch to line 71
   */

  @Test
  public void com_mycollab_core_utils_StringUtils_trim_003_4a5260e2d56f2f38() throws Throwable {

    String retval;
    {
      /* Arrange */
      String param_2 = "!!!!!!";
      String input = param_2;
      int length = 6;
      boolean withEllipsis = false;

      /* Act */
      retval = com.mycollab.core.utils.StringUtils.trim(input, length, withEllipsis);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertEquals("!!!!!!", retval);
    }
  }
}