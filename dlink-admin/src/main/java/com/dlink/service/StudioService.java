package com.dlink.service;

import com.dlink.dto.StudioDDLDTO;
import com.dlink.dto.StudioExecuteDTO;
import com.dlink.explainer.ca.TableCANode;
import com.dlink.job.JobResult;
import com.dlink.result.IResult;
import com.dlink.result.SelectResult;

import java.util.List;

/**
 * StudioService
 *
 * @author wenmo
 * @since 2021/5/30 11:07
 */
public interface StudioService {

    JobResult executeSql(StudioExecuteDTO studioExecuteDTO);

    IResult executeDDL(StudioDDLDTO studioDDLDTO);

    SelectResult getJobData(String jobId);

    boolean clearSession(String session);

    List<TableCANode> getOneTableCAByStatement(String statement);

    List<TableCANode> getOneTableColumnCAByStatement(String statement);
}
