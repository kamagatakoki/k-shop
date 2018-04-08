package action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import dao.GenreLgDao;
import entity.GenreLg;
import form.GenreLgForm;

public class GenreLgAction extends MappingDispatchAction {

	public ActionForward select(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		GenreLgForm genreLgForm = (GenreLgForm) form;

		GenreLgDao genreLgDao = new GenreLgDao();

		List<GenreLg> genreLgList = new ArrayList<>();
		if (genreLgForm.getSearchGenreLgCd().isEmpty()) {
			genreLgList = genreLgDao.getGenreLg();
		} else {
			genreLgList = genreLgDao.getGenreLgById(genreLgForm.getSearchGenreLgCd());
		}

		request.setAttribute("genreLgList", genreLgList);

		return mapping.findForward("list");
	}

	public ActionForward create(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		GenreLgForm genreLgForm = (GenreLgForm) form;

		GenreLgDao genreLgDao = new GenreLgDao();
		List<GenreLg> genreLgList = genreLgDao.getGenreLg();

		request.setAttribute("genreLgList", genreLgList);

		return mapping.findForward("list");
	}

	public ActionForward update(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		GenreLgForm genreLgForm = (GenreLgForm) form;

		GenreLgDao genreLgDao = new GenreLgDao();
		List<GenreLg> genreLgList = genreLgDao.getGenreLg();

		request.setAttribute("genreLgList", genreLgList);

		return mapping.findForward("list");
	}

	public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		GenreLgForm genreLgForm = (GenreLgForm) form;

		GenreLgDao genreLgDao = new GenreLgDao();
		List<GenreLg> genreLgList = genreLgDao.getGenreLg();

		request.setAttribute("genreLgList", genreLgList);

		return mapping.findForward("list");
	}

}
