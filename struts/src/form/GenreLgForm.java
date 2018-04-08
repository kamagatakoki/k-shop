package form;

import org.apache.struts.action.ActionForm;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class GenreLgForm extends ActionForm {

	public String genreLgCd;

	public String genreLgNm;

	public String displayOrder;

	public String searchGenreLgCd;

	public String searchGenreLgNm;

	public String crud;
}
