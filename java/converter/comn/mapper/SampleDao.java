package converter.comn.mapper;

import org.apache.ibatis.annotations.Mapper;

import converter.comn.vo.Sample;

import java.util.Map;

/**
 * 공고 DAO
 *
 * @author Kim Jae Moon
 * @since 2017. 4. 06.
 */
@Mapper
public interface SampleDao {

	Sample selectExistedSample(Map<String,Object> map);
	/**
     * 조회한다.
     *
     * @param id ID
     * @return 공고
     */
    Sample selectSample(Map map);
	
    long insertSample(Sample sample);
    long updateSample(Sample sample);

}